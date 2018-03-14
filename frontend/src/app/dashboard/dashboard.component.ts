import { Component, OnInit } from '@angular/core';
import { UseCase } from '../model/use-case';
import { UseCaseService } from '../use-case.service';
 
@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: [ './dashboard.component.css' ]
})
export class DashboardComponent implements OnInit {
  heroes: UseCase[] = [];
 
  constructor(private heroService: UseCaseService) { }
 
  ngOnInit() {
    this.getHeroes();
  }
 
  getHeroes(): void {
    this.heroService.getUseCases()
      .subscribe(heroes => this.heroes = heroes.slice(1, 5));
  }
}