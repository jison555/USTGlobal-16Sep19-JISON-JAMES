import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ngfor',
  templateUrl: './ngfor.component.html',
  styleUrls: ['./ngfor.component.css']
})
export class NgforComponent implements OnInit {
  Products = [
    {
      img : 'https://cdn.pixabay.com/photo/2019/09/08/15/08/owl-4461236__340.jpg',
      name : 'jison',
      price : 34 ,
    },
    {
      img : 'https://cdn.pixabay.com/photo/2019/09/05/20/30/girl-4455005__340.jpg',
      name : 'sam',
      price : 33 ,
    }
  ] ;

  constructor() { }

  ngOnInit() {
  }

}
