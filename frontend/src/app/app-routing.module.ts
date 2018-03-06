import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UseCasesComponent } from './use-cases/use-cases.component'
import { DashboardComponent }   from './dashboard/dashboard.component';
import { UseCaseDetailComponent }  from './use-case-detail/use-case-detail.component';
import { StartComponent } from './start/start.component';

const routes: Routes = [
  { path: '', redirectTo: '/dashboard', pathMatch: 'full' },
  { path: 'dashboard', component: DashboardComponent },
  { path: 'use-cases', component: UseCasesComponent },
  { path: 'use-case/:id', component: UseCaseDetailComponent },
  { path: 'start', component: StartComponent }
];
 
@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}