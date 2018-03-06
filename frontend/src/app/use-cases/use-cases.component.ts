import { Component, OnInit } from '@angular/core';
import { UseCase } from '../model/use-case'
import { USE_CASES } from '../mock-use-cases';
import { UseCaseService } from '../use-case.service'

@Component({
  selector: 'app-use-cases',
  templateUrl: './use-cases.component.html',
  styleUrls: ['./use-cases.component.css']
})
export class UseCasesComponent implements OnInit {

  heroes: UseCase[];
  
  selectedHero: UseCase;

  onSelect(hero: UseCase): void {
    this.selectedHero = hero;
  }

  getUseCases(): void {
    
  }

  constructor(private useCaseService: UseCaseService) { }

  ngOnInit() {
    this.useCaseService.getHeros()
      .subscribe(heroes => this.heroes = heroes);
  }

}
