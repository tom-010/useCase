import { Observable } from "rxjs/Observable";
import { Example } from './example'
import { of } from 'rxjs/observable/of';
import { Observer } from "rxjs/Observer";
import { ExamplesRepository } from './examples-repository'
import { DomainContext } from "../domain-context";

export enum UseCaseStatus {
    NEW, SAVED, DELETED, DIRTY
}

export class UseCase {
    
    private $id: number;
    private $name: string;
    private $examples: Observable<Example[]>;
    private $status: UseCaseStatus = UseCaseStatus.NEW;
    private examplesRepo: ExamplesRepository;
    private ctx: DomainContext;

    constructor(ctx: DomainContext, id?: number, name?: string) {
        if(ctx) {
            this.examplesRepo = ctx.examplesRepo;
            this.ctx = ctx;
        }
            
        this.id = id;
        this.name = name;
        this.status = UseCaseStatus.NEW;
    }

    public get id(): number {
        return this.$id;
    }

    public set id(id: number) {
        this.$id = id ? id : null;
    }

    public get name(): string {
        return this.$name;
    }

    public set name(name: string) {
        this.dirty();
        this.$name = name ? name : null;
    }

    public get examples(): Observable<Example[]> {
        if(!this.$examples)
            this.$examples = this.examplesRepo.findAllForUseCase(this.id);
        this.$examples = of([]);
        return this.$examples;
    }

    public set examples(examples: Observable<Example[]>) {
        this.$examples = examples;
    }

    public get status() {
        return this.$status;
    }

    public set status(status: UseCaseStatus) { // TODO: make less visible
        this.$status = status;
    }

    public save(): Observable<UseCase> {
        this.status = UseCaseStatus.SAVED;
        const updateMode: boolean = this.id && this.id > 0;
        const res: Observable<UseCase> = updateMode ? 
                              this.ctx.useCaseRepo.update(this)
                            : this.ctx.useCaseRepo.insert(this);
        res.subscribe(_=> this.ctx.broker.publish( updateMode ? 'UseCase_updated' : 'UseCase_created', this))
        return res;
    }

    public delete(): Observable<UseCase> {
        this.status = UseCaseStatus.DELETED;
        let res: Observable<UseCase> = this.ctx.useCaseRepo.delete(this);
        res.subscribe((d) => this.ctx.broker.publish('UseCase_deleted', this));
        return res;
    }

    private dirty() {
        if(this.status == UseCaseStatus.DELETED)
            return;

        this.status = UseCaseStatus.DIRTY;
    }
}