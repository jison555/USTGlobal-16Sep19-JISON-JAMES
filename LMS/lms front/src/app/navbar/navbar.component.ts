import { Component, OnInit, DoCheck } from '@angular/core';
import { LibraryserviceService } from '../libraryservice.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit,DoCheck {

  isAdmin;
  notLogin=true;
  constructor(private service:LibraryserviceService) { }

  ngOnInit() {

  }
  ngDoCheck(){
    this.isAdmin=this.service.isAdmin;
    if(this.isAdmin){
      this.notLogin=false;
    }
  }
}
