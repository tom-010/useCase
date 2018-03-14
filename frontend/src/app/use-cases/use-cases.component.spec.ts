import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { AppModule } from '../app.module'
import { UseCasesComponent } from './use-cases.component';
import { UseCaseMockService } from './use-case-mock.service'
import { UseCaseService } from '../use-case.service';


describe('UseCasesComponent', () => {
  let component: UseCasesComponent;
  let fixture: ComponentFixture<UseCasesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [ AppModule ],
      providers: [ UseCaseMockService ],
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

  it('should ask the use-case-service for data on init', ()=> {
    let useCaseService = TestBed.get(UseCaseService);
    spyOn(useCaseService, 'getUseCases').and.callThrough();
  })

  // it('should show the name of the use-case in the list view', ()=> {
  //   userService = TestBed.get(UserService);
  // });

  /*
  Show all in listview
  On-Click jump to edit-view
  */
});
