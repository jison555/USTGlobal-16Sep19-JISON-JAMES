import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
  name = 'jison';
  address = 'kunnumpuram h,perumpanachy po chry kottayam';
  imge = 'https://cdn.pixabay.com/photo/2017/11/04/11/25/fog-2917232__340.jpg';
  colorname = 'red';
  isActive = false;

  constructor() {}

  ngOnInit() {


  }

}
