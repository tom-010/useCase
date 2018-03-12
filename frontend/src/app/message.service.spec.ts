import { TestBed, inject } from '@angular/core/testing';
import { AppModule } from './app.module'
import { MessageService } from './message.service';

describe('MessageService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [ AppModule ],
      declarations: []
    })
    .compileComponents();
  });

  it('should be created', inject([MessageService], (service: MessageService) => {
    expect(service).toBeTruthy();
  }));
});
