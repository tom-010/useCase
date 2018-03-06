import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatButtonModule, MatCheckboxModule } from '@angular/material';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { UseCaseService } from './use-case.service';
import { UseCasesComponent } from './use-cases/use-cases.component';
import { UseCaseDetailComponent } from './use-case-detail/use-case-detail.component';

@NgModule({
  declarations: [
    AppComponent,
    UseCasesComponent,
    UseCaseDetailComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    BrowserAnimationsModule,
    MatButtonModule, MatCheckboxModule
  ],
  providers: [UseCaseService],
  bootstrap: [AppComponent]
})
export class AppModule { }
