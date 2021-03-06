import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { UseCaseService } from './use-case.service';
import { UseCasesComponent } from './use-cases/use-cases.component';
import { UseCaseDetailComponent } from './use-case-detail/use-case-detail.component';
import { MessagesComponent } from './messages/messages.component';
import { MessageService } from './message.service';
import { AppRoutingModule } from './/app-routing.module';
import { DashboardComponent } from './dashboard/dashboard.component';
import { StartComponent } from './start/start.component';
import { MaterialModule } from './material.module';
import {APP_BASE_HREF} from '@angular/common';
import { CreateUseCaseComponent } from './create-use-case/create-use-case.component';

@NgModule({
  declarations: [
    AppComponent,
    UseCasesComponent,
    UseCaseDetailComponent,
    MessagesComponent,
    DashboardComponent,
    StartComponent,
    CreateUseCaseComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    MaterialModule
  ],
  providers: [UseCaseService, MessageService, {provide: APP_BASE_HREF, useValue : '/' }],
  bootstrap: [AppComponent]
})
export class AppModule { }
