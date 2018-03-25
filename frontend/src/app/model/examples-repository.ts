import { Observable } from "rxjs/Observable";
import { Example } from "./example";

export interface ExamplesRepository {
    findAllForUseCase(useCaseId: number): Observable<Example[]>;
}