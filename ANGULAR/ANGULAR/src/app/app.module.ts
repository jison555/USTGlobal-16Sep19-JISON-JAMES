import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { HelpComponent } from './help/help.component';
import { LoginComponent } from './login/login.component';
import { AboutComponent } from './about/about.component';
import { NavbarComponent } from './navbar/navbar.component';
import { RouterModule } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';
import { ContactComponent } from './contact/contact.component';
import { TwowayBindingComponent } from './data-binding/twoway-binding/twoway-binding.component';
import { StructuralDirectiveComponent } from './structural-directive/structural-directive.component';
import { NgifComponent } from './structural-directive/ngif/ngif.component';
import { NgforComponent } from './structural-directive/ngfor/ngfor.component';
import { NgswitchComponent } from './structural-directive/ngswitch/ngswitch.component';
import { CustomDirective } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { Form1Component } from './form1/form1.component';
import { Form2Component } from './form2/form2.component';
import { Form3Component } from './form3/form3.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { DollarPipe } from './dollar.pipe';


@NgModule({
  declarations: [
      AppComponent ,
      LoginComponent ,
      HelpComponent ,
      HeaderComponent ,
      AboutComponent,
      NavbarComponent ,
      HomeComponent,
      FooterComponent,
      DataBindingComponent,
      PropertyBindingComponent,
      EventBindingComponent,
       ContactComponent,
       TwowayBindingComponent,
       StructuralDirectiveComponent,
       NgifComponent,
       NgforComponent,
       NgswitchComponent,
       CustomDirective,
       RegisterComponent,
       Form1Component,
       Form2Component,
       Form3Component,
       ReactiveFormComponent,
       ParentComponent,
       ChildComponent,
       CommentComponent,
       CommentDetailsComponent,
       DollarPipe

    ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : '' , component : HomeComponent },
      {path : 'about', component : AboutComponent },
      {path : 'help' , component : HelpComponent},
      {path : 'property-binding' , component : PropertyBindingComponent},
      {path : 'event-binding' , component : EventBindingComponent },
      {path : 'contact' , component : ContactComponent},
      {path : 'twoway' , component : TwowayBindingComponent},
      {path : 'ngif' , component : NgifComponent},
      {path : 'ngfor' , component : NgforComponent},
      {path : 'ngswitch' , component : NgswitchComponent },
      {path : 'register' , component : RegisterComponent},
      {path : 'form1' , component : Form1Component},
      {path : 'form2' , component : Form2Component},
      {path : 'form3' , component : Form3Component},
      {path : 'reactive-form' , component : ReactiveFormComponent},
      {path : 'parent' , component : ParentComponent},
      {path : 'comment-deatails' , component : CommentDetailsComponent}
        ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
