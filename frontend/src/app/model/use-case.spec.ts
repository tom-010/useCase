import { UseCase, UseCaseStatus } from './use-case';
import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';
import { Example } from './example';
import { ExamplesRepository } from './examples-repository';

describe('UseCase Model Class', () => {

    class StubExamplesRepo implements ExamplesRepository {
        findAllForUseCase(useCaseId: number): Observable<Example[]> {
            return of([]);
        }
    }

    function setUp() {
        const examplesRepo = new StubExamplesRepo;
        const uut: UseCase = new UseCase(examplesRepo);
        return { uut, examplesRepo };
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
        const { uut, examplesRepo } = setUp();
        const spy = spyOn(examplesRepo, 'findAllForUseCase');
        uut.examples; // calls the getter
        expect(spy).toHaveBeenCalledTimes(1);
    })

    it('should not call example-repository if examples are already set', () => {
        const { uut, examplesRepo } = setUp();
        const spy = spyOn(examplesRepo, 'findAllForUseCase');
        uut.examples = of([]);
    
        uut.examples; // calls the getter

        expect(spy).toHaveBeenCalledTimes(0);
    })

    /*
    
    should call examples service, if example list is changed
    save should trigger use-case-service
    delete should trigger use-case-service
    delete should remove the id
    update should keep the id
    insert should add the id
    
    insert should trigger message
    update should trigger message
    delte should trigger message
    save should trigger message
    */
});