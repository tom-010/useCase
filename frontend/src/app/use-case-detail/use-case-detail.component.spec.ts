import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { AppModule } from '../app.module'
import { UseCaseDetailComponent } from './use-case-detail.component';

describe('UseCaseDetailComponent', () => {
  let component: UseCaseDetailComponent;
  let fixture: ComponentFixture<UseCaseDetailComponent>;

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
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
