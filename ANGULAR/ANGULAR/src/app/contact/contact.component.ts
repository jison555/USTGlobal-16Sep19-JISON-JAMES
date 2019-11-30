import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {

  colorname = 'red';
  isActive = false;

  constructor() {
    setInterval(() => {
      this.isActive = !this.isActive;
    } , 2000);
   }

  ngOnInit() {
  }

}
