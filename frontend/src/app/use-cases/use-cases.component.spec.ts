import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { AppModule } from '../app.module'
import { UseCasesComponent } from './use-cases.component';
import { UseCaseMockService } from './use-case-mock.service'
import { UseCaseService } from '../use-case.service';
import { MessageService } from '../message.service';
import { UseCase } from '../model/use-case';


describe('UseCasesComponent', () => {
  let component: UseCasesComponent;
  let fixture: ComponentFixture<UseCasesComponent>;
  let mockService: UseCaseMockService
  let useCase: UseCase;
  let sampleUseCaseName: string = "unique_name";

  function prepareUseCaseService() {
    mockService = new UseCaseMockService(TestBed.get(MessageService));
    useCase = new UseCase();
    useCase.id = 1;
    useCase.name = sampleUseCaseName;
    mockService.addUseCase(useCase);
  }

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [ AppModule ],
      providers: [ UseCaseMockService ],
      declarations: []
    })
    .compileComponents();
  }));

  beforeEach(() => {
    prepareUseCaseService();
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

  it('should contain the table view', () => {
    const tableView = fixture.debugElement.nativeElement.querySelector('#use-cases_list-all-table')
    expect(tableView).not.toBeNull();
    expect(tableView).not.toBe(undefined);
  });


  /*
  Show all in listview
  On-Click jump to edit-view
  */
});
