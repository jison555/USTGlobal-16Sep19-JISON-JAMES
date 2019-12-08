import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { LoginComponent } from './student/login/login.component';
import { LibloginComponent } from './librarian/liblogin/liblogin.component';
import { AdmloginComponent } from './admin/admlogin/admlogin.component';
import { from } from 'rxjs';
import { HttpClientModule } from '@angular/common/http';
import { RegstudentComponent } from './admin/regstudent/regstudent.component';
import { AdminhomeComponent } from './admin/adminhome/adminhome.component';
import { ReglibrarianComponent } from './admin/reglibrarian/reglibrarian.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    LoginComponent,
    LibloginComponent,
    AdmloginComponent,
    RegstudentComponent,
    AdminhomeComponent,
    ReglibrarianComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      {path : 'studentlogin', component : LoginComponent},
      {path : 'librarylogin', component : LibloginComponent},
      {path : 'adminlogin', component : AdmloginComponent},
      {path : 'registerStudent', component : RegstudentComponent},
      {path : 'adminHome', component : AdminhomeComponent },
      {path : 'registerlibrarian', component : ReglibrarianComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
