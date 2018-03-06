import { Injectable } from '@angular/core';
import { USE_CASES } from './mock-use-cases'
import { UseCase } from './model/use-case';
import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';

@Injectable()
export class UseCaseService {

  getHeros(): Observable<UseCase[]> {
    return of(USE_CASES);
  }

  constructor() { }

}
