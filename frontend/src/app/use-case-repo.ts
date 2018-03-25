import { UseCase } from "./model/use-case";
import { Observable } from "rxjs/Observable";

export interface UseCaseRepository {
    insert(usecase: UseCase): Observable<UseCase>;
    update(usecase: UseCase): Observable<UseCase>;
    delete(usecase: UseCase): Observable<UseCase>;
}