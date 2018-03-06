import { Component, OnInit, Input } from '@angular/core';
import { UseCase } from '../model/use-case';

@Component({
  selector: 'app-use-case-detail',
  templateUrl: './use-case-detail.component.html',
  styleUrls: ['./use-case-detail.component.css']
})
export class UseCaseDetailComponent implements OnInit {

  @Input() hero: UseCase;

  constructor() { }

  ngOnInit() {
  }

}
