import { BrowserModule } from '@angular/platform-browser';
import { NgModule} from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BasepageComponent } from './basepage/basepage.component';
import { RouterModule } from '@angular/router';
import { CustomDirective } from './custom.directive';
import { MoviesComponent } from './movies/movies.component';
import { LoginComponent } from './login/login.component';
import { ReactiveformComponent } from './reactiveform/reactiveform.component';
import { TemplateformComponent } from './templateform/templateform.component';
import { HttpClientModule } from '@angular/common/http';



@NgModule({
  declarations: [
    AppComponent,
    BasepageComponent,
    CustomDirective,
    MoviesComponent,
    LoginComponent,
    ReactiveformComponent,
    TemplateformComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      {path : 'movies' , component : MoviesComponent},
      {path: 'reactivelogin' , component:ReactiveformComponent},
      {path : 'templatelogin' , component: TemplateformComponent}
  ])
   ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
