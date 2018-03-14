import { Injectable } from '@angular/core';
import { USE_CASES } from './mock-use-cases'
import { UseCase } from './model/use-case';
import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';
import { MessageService } from './message.service';

@Injectable()
export class UseCaseService {

  getUseCase(id: number): Observable<UseCase> {
    this.messageService.add(`HeroService: fetched hero id=${id}`);
    return of(USE_CASES.find(hero => hero.id === id));
  }

  getUseCases(): Observable<UseCase[]> {
    this.messageService.add('HeroService: fetched heroes');
    return of(USE_CASES);
  }

  constructor(private messageService: MessageService) { }

}