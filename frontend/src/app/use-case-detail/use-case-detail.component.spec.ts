import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { AppModule } from '../app.module'
import { UseCaseDetailComponent } from './use-case-detail.component';

describe('UseCaseDetailComponent', () => {
  let component: UseCaseDetailComponent;
  let fixture: ComponentFixture<UseCaseDetailComponent>;
  let compiled;
  
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [ AppModule ],
      declarations: []
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UseCaseDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
    compiled = fixture.debugElement.nativeElement;;
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  //it('should contain the header with the keyword use-case', () => {
    //expect(element('#use-case-detail_header').textContent.toLowerCase()).toContain("use-case");
  //});

  function element(selector: string): any {
    return compiled.querySelector(selector);
  }

  // should contain the header with the use-case name in it
  // should contain a scenarios section
  // should contain input section
  // should contain output section
  // should contain Steps section
  // should contain a notes section
  // should contain a button to all use cases
  // on button to all use-cases changes the view
  // should ask the use-case-service for the data

});