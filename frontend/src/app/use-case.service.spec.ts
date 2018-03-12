import { TestBed, inject } from '@angular/core/testing';
import { AppModule } from './app.module'
import { UseCaseService } from './use-case.service';

describe('UseCaseService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [ AppModule ],
      declarations: []
    })
    .compileComponents();
  });

  it('should be created', inject([UseCaseService], (service: UseCaseService) => {
    expect(service).toBeTruthy();
  }));
});
