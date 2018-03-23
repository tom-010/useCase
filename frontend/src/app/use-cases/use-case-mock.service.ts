import { Injectable } from '@angular/core';
import { USE_CASES } from '../mock-use-cases'
import { UseCase } from '../model/use-case';
import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';
import { UseCaseService } from '../use-case.service'

@Injectable()
export class UseCaseMockService extends UseCaseService {
  public useCases: Array<UseCase> = [];
  public shouldReturnNext: UseCase = null;

  addUseCase(useCase: UseCase): void {
    this.useCases.push(useCase);
  }

  getUseCase(id: number): Observable<UseCase> {
    return of(this.shouldReturnNext);
  }

  getUseCases(): Observable<UseCase[]> {
    return of(this.useCases);
  }
}
