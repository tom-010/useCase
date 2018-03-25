import { Observable } from "rxjs/Observable";
import { Example } from './example'
import { of } from 'rxjs/observable/of';
import { Observer } from "rxjs/Observer";
import { ExamplesRepository } from './examples-repository'

export enum UseCaseStatus {
    NEW, SAVED, DELETED, DIRTY
}

export class UseCase {
    
    private $id: number;
    private $name: string;
    private $examples: Observable<Example[]>;
    private $status: UseCaseStatus = UseCaseStatus.NEW;
    
    private examplesRepo: ExamplesRepository;

    constructor(examplesRepo: ExamplesRepository, id?: number, name?: string) {
        this.examplesRepo = examplesRepo;
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
        return of(this);
    }

    public delete(): Observable<UseCase> {
        this.status = UseCaseStatus.DELETED;
        return of(this);
    }

    private dirty() {
        if(this.status == UseCaseStatus.DELETED)
            return;

        this.status = UseCaseStatus.DIRTY;
    }
}