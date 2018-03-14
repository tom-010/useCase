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

  it('should have a use-case create button', () => {
    const compiled = fixture.debugElement.nativeElement;
    const btn = compiled.querySelector('#use-cases_create-use-case')
    expect(btn.textContent).toContain('New Use Case');
  })

  it('should jump to new-use-case-screen on button click', () => {
    const compiled = fixture.debugElement.nativeElement;
    const btn = compiled.querySelector('#use-cases_create-use-case')
    btn.click();

    fixture.whenStable().then(() => {
      expect(window.location.href).toContain('/use-case/create'); 
    })


  });
});
