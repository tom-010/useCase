import { UseCase, UseCaseStatus } from './use-case';
import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';
import { Example } from './example';
import { ExamplesRepository } from './examples-repository';
import { DomainContext } from '../domain-context';
import { Broker } from '../broker';
import { UseCaseRepository } from '../use-case-repo';
import { Subscriber } from 'rxjs/Subscriber';
import 'rxjs/add/operator/delay';

describe('UseCase Model Class', () => {

    class StubExamplesRepo implements ExamplesRepository {
        findAllForUseCase(useCaseId: number): Observable<Example[]> {
            return of([]);
        }
        
        save(examples: Example[]): Observable<Example[]> {
            return of([]);
        }
    } 

    class StubUseCaseRepo implements UseCaseRepository {
        update(usecase: UseCase): Observable<UseCase> {
            return of(usecase).delay(10);
        }
        insert(usecase: UseCase): Observable<UseCase> {
            return of(usecase).delay(10);
        }
        delete(usecase: UseCase): Observable<UseCase> {
            return of(usecase).delay(10); // 10 MS that the thread goes sleeping
        }
    }
    function delay(ms: number) {
        return new Promise(resolve => setTimeout(resolve, ms));
    }

    function setUp() {
        const ctx: DomainContext = DomainContext.get();
        ctx.broker = new Broker();
        ctx.examplesRepo = new StubExamplesRepo();
        ctx.useCaseRepo = new StubUseCaseRepo(); 
        const uut: UseCase = new UseCase(ctx);
        return { uut, ctx };
    }

    it('should return null initally for id', () => {
        const { uut } = setUp();
        expect(uut.id).toBeNull();
    })

    it('should return null initally for name', () => {
        const { uut } = setUp();
        expect(uut.name).toBeNull();
    })

    it('always should return a promise for examples', () => {
        const { uut } = setUp();
        expect(uut.examples instanceof Observable).toBeTruthy();
    })

    it('should return a list after promise is loaded for example', (resolve) => {
        const { uut } = setUp();
        uut.examples.subscribe((res) => {
            expect(res instanceof Array).toBeTruthy();
            resolve();
        })
    });

    it('should return empty list of examples for fresh init use-case', (resolve)=> {
        const { uut } = setUp();
        uut.examples.subscribe((res) => {
            expect(res.length).toBe(0);
            resolve();
        })
    })

    it('should have status NEW if new instance created', () => {
        const { uut } = setUp();
        expect(uut.status).toBe(UseCaseStatus.NEW);
    });

    it('should have status SAVED after save', (v) => {
        const { uut } = setUp();
        uut.save().subscribe(() => {
            expect(uut.status).toBe(UseCaseStatus.SAVED);
            v();
        })
        
    })

    it('should have status DELETED afer delete', (v) => {
        const { uut } = setUp();
        uut.delete().subscribe(() => {
            expect(uut.status).toBe(UseCaseStatus.DELETED);
            v();
        });
    });

    it('should set status to dirty, if name is changed', () => {
        const { uut } = setUp();
        expect(uut.status).not.toBe(UseCaseStatus.DIRTY); 
        uut.name = "new name";
        expect(uut.status).toBe(UseCaseStatus.DIRTY);
    });

    it('should not set status to dirty on set name, if status is deleted', () => {
        const { uut } = setUp();
        uut.status = UseCaseStatus.DELETED;
        uut.name = "new name";
        expect(uut.status).toBe(UseCaseStatus.DELETED); 
    })
    
    it('should call example-repository if examples not set', () => {
        const { uut, ctx } = setUp();
        const spy = spyOn(ctx.examplesRepo, 'findAllForUseCase');
        uut.examples; // calls the getter
        expect(spy).toHaveBeenCalledTimes(1);
    })

    it('should not call example-repository if examples are already set', () => {
        const { uut, ctx } = setUp();
        const spy = spyOn(ctx.examplesRepo, 'findAllForUseCase');
        uut.examples = of([]);
    
        uut.examples; // calls the getter

        expect(spy).toHaveBeenCalledTimes(0);
    });

    it('should trigger use-case saved event on save', (v) => {
        const { uut, ctx } = setUp();
        const spy = spyOn(ctx.broker, "publish");
        uut.save().subscribe(_=> {
            expect(spy).toHaveBeenCalledTimes(1); v();    
        });
    });

    it('should call create on use-case-repo on save without id', () => {
        const { uut, ctx } = setUp();
        const spy = spyOn(ctx.useCaseRepo, "insert").and.callThrough();
        uut.id = null;
        
        uut.save();
        expect(spy).toHaveBeenCalledTimes(1);
    })

    it('should not call insert on save, if id is already given', () => {
        const { uut, ctx } = setUp();
        const spy = spyOn(ctx.useCaseRepo, "insert").and.callThrough();
        uut.id = 1;
        uut.save();
        expect(spy).toHaveBeenCalledTimes(0);
    })

    it('should call update on save, if id is already given', () => {
        const { uut, ctx } = setUp();
        const spy = spyOn(ctx.useCaseRepo, "update").and.callThrough();
        uut.id = 1;
        uut.save();
        expect(spy).toHaveBeenCalledTimes(1);
    })

    it('should not call update on save, if no id is given', () => {
        const { uut, ctx } = setUp();
        const spy = spyOn(ctx.useCaseRepo, "update").and.callThrough();
        uut.id = null;
        uut.save();
        expect(spy).toHaveBeenCalledTimes(0);
    })

    it('should call insert if id is 0', () => {
        const { uut, ctx } = setUp();
        const spy = spyOn(ctx.useCaseRepo, "insert").and.callThrough();
        uut.id = 0;
        uut.save();
        expect(spy).toHaveBeenCalledTimes(1);
    })

    it('should not call update if id is 0', () => {
        const { uut, ctx } = setUp();
        const spy = spyOn(ctx.useCaseRepo, "update").and.callThrough();
        uut.id = 0;
        uut.save();
        expect(spy).toHaveBeenCalledTimes(0);
    })

    it('should call insert if id is negative', () => {
        const { uut, ctx } = setUp();
        const spy = spyOn(ctx.useCaseRepo, "insert").and.callThrough();
        uut.id = -1;
        uut.save();
        expect(spy).toHaveBeenCalledTimes(1);
    })

    it('should not call update if id is negative', () => {
        const { uut, ctx } = setUp();
        const spy = spyOn(ctx.useCaseRepo, "update").and.callThrough();
        uut.id = -1;
        uut.save();
        expect(spy).toHaveBeenCalledTimes(0);
    })

    it('should call use-case-repo if delete is triggered', () => {
        const { uut, ctx } = setUp();
        const repoDeleteSpy = spyOn(ctx.useCaseRepo, "delete").and.callThrough();
        uut.delete();
        expect(repoDeleteSpy).toHaveBeenCalledTimes(1);
    })

    it('should send delte-event if use-case gets deleted', (v) => {
        const { uut, ctx } = setUp();
        const brokerPublishSpy = spyOn(ctx.broker, "publish");
        uut.delete().subscribe(_ => {
            setTimeout(()=> {
                expect(brokerPublishSpy).toHaveBeenCalled(); v(); // TODO: ensure, that it is called only once
            }, 10); // Sleep to ensure message sending
        });
    })

    it('should send delete-event, after Observable has succeed', (v) => {
        const { uut, ctx } = setUp();
        const spy = spyOn(ctx.broker, "publish");
        const ir: Observable<UseCase> = uut.delete();
        expect(spy).toHaveBeenCalledTimes(0);
        ir.subscribe(e => {
            expect(spy).toHaveBeenCalledTimes(1); v();
        });
    });

    it('should send delete-event into right channel', (v) => {
        const { uut, ctx } = setUp();
        const brokerPublishSpy = spyOn(ctx.broker, "publish");
        uut.delete().subscribe(_ => {
            expect(brokerPublishSpy).toHaveBeenCalledWith('UseCase_deleted', jasmine.any(Object)); v();
        })
    })

    it('should send created-event when use-case is created', (v) => {
        const { uut, ctx } = setUp();
        const brokerPublishSpy = spyOn(ctx.broker, "publish");
        uut.id = null;
        uut.save().subscribe(_=> {
            expect(brokerPublishSpy).toHaveBeenCalled(); v();
        })
    })

    it('should send create-event just after Observable has succeed', (v) => {
        const { uut, ctx } = setUp();
        const spy = spyOn(ctx.broker, "publish");
        uut.id = null; // force create
        const ir: Observable<UseCase> = uut.save();
        expect(spy).toHaveBeenCalledTimes(0);
        ir.subscribe(e => {
            expect(spy).toHaveBeenCalledTimes(1); v();
        });
    });

    it('should send update-event just after Observable has succeed', (v) => {
        const { uut, ctx } = setUp();
        const spy = spyOn(ctx.broker, "publish");
        uut.id = 1; // force update
        const ir: Observable<UseCase> = uut.save();
        expect(spy).toHaveBeenCalledTimes(0);
        ir.subscribe(e => {
            expect(spy).toHaveBeenCalledTimes(1); v();
        });
    });

    it('should send create-event into right channel', (v) => {
        const { uut, ctx } = setUp();
        const brokerPublishSpy = spyOn(ctx.broker, "publish");
        uut.id = null;
        uut.save().subscribe(_ => {
            expect(brokerPublishSpy).toHaveBeenCalledWith('UseCase_created', jasmine.any(Object)); v();
        })
    })

    it('should send update-event into right channel', (v) => {
        const { uut, ctx } = setUp();
        const brokerPublishSpy = spyOn(ctx.broker, "publish");
        uut.id = 1; // force update
        uut.save().subscribe(_ => {
            expect(brokerPublishSpy).toHaveBeenCalledWith('UseCase_updated', jasmine.any(Object)); v();
        })
    })

    it('should keept the id on delete', (v) => {
        const { uut } = setUp();
        uut.id = 1;
        uut.delete().subscribe(_=> {
            expect(uut.id).toBe(1); v();
        });
    });

    it('should keep the id on update', (v) => {
        const { uut } = setUp();
        uut.id = 1;
        uut.save().subscribe(_=> {
            expect(uut.id).toBe(1); v();
        });
    });
});