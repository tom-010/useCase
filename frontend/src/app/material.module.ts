import { NgModule } from '@angular/core';

import { MatButtonModule, MatCheckboxModule, MatCardModule, MatSidenavModule, MatMenuModule, MatToolbarModule, MatTableModule, MatPaginatorModule, MatFormFieldModule } from '@angular/material';
@NgModule({
    imports: [
        MatButtonModule, 
        MatCheckboxModule,
        MatCardModule, 
        MatSidenavModule, 
        MatMenuModule, 
        MatToolbarModule, 
        MatTableModule, 
        MatPaginatorModule, 
        MatFormFieldModule,
    ],
    exports: [
        MatButtonModule, 
        MatCheckboxModule,
        MatCardModule, 
        MatSidenavModule, 
        MatMenuModule, 
        MatToolbarModule, 
        MatTableModule, 
        MatPaginatorModule, 
        MatFormFieldModule,
    ]
  })
export class MaterialModule {}