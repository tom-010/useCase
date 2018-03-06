import { TestBed, inject } from '@angular/core/testing';

import { UseCaseService } from './use-case.service';

describe('UseCaseService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [UseCaseService]
    });
  });

  it('should be created', inject([UseCaseService], (service: UseCaseService) => {
    expect(service).toBeTruthy();
  }));
});
