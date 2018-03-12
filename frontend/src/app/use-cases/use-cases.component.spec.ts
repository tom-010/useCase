import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { AppModule } from '../app.module'
import { UseCasesComponent } from './use-cases.component';

describe('UseCasesComponent', () => {
  let component: UseCasesComponent;
  let fixture: ComponentFixture<UseCasesComponent>;


  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [ AppModule ],
      declarations: []
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UseCasesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });


  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
