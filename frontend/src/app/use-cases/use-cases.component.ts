import { Component, OnInit, ViewChild } from '@angular/core';
import { UseCase } from '../model/use-case'
import { USE_CASES } from '../mock-use-cases';
import { UseCaseService } from '../use-case.service'
import { MatTableDataSource, MatPaginator, MatSort } from '@angular/material';

@Component({
  selector: 'app-use-cases',
  templateUrl: './use-cases.component.html',
  styleUrls: ['./use-cases.component.css']
})
export class UseCasesComponent implements OnInit {

  @ViewChild(MatPaginator) paginator: MatPaginator;
  @ViewChild(MatSort) sort: MatSort

  displayedColumns = ['id', 'name', 'lastChanged', 'lastChangedBy'];
  useCases = new MatTableDataSource<UseCase>();

  heroes: UseCase[];
  
  selectedHero: UseCase;

  constructor(private useCaseService: UseCaseService) { }

  ngOnInit() {
    this.getUseCases();
  }

  getUseCases(): void { 
    this.useCaseService.getHeros()
      .subscribe(ucs => {
        this.useCases = new MatTableDataSource(ucs)
        this.useCases.sort = this.sort;
        this.useCases.filterPredicate = this.filter;  
      });
  }

  filter(data, query): boolean {
    return JSON.stringify(data).toLowerCase().includes(query);
  }

  applyFilter(filterValue: string) {
    this.useCases.filter = filterValue.trim().toLowerCase();
  }

}
