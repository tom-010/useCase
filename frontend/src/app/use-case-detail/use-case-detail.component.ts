import { Component, OnInit, Input } from '@angular/core';
import { UseCase } from '../model/use-case';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';
import { UseCaseService }  from '../use-case.service';

@Component({
  selector: 'app-use-case-detail',
  templateUrl: './use-case-detail.component.html',
  styleUrls: ['./use-case-detail.component.css']
})
export class UseCaseDetailComponent implements OnInit {

  @Input() hero: UseCase;

  constructor(
    private route: ActivatedRoute,
    private useCaseService: UseCaseService,
    private location: Location
  ) { }

  ngOnInit() {
    this.getUseCase();
  }

  getUseCase(): void {
    const id = +this.route.snapshot.paramMap.get('id');
    this.useCaseService.getHero(id)
      .subscribe(hero => this.hero = hero);
  }

  goBack(): void {
    this.location.back();
  }
}
