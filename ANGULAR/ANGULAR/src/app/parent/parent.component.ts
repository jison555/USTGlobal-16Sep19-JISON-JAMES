import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  selectedCar;

  Cars = [
    {
      imgurl : 'https://cdn.pixabay.com/photo/2014/09/07/22/34/car-race-438467__340.jpg',
      name : 'audi'
    },
    {
      imgurl : 'https://cdn.pixabay.com/photo/2013/08/11/03/40/corvette-171422__340.jpg',
      name : 'benz'
    }
  ];

  constructor() { }

  ngOnInit() {
  }

  sendCar(car) {
    console.log(car);
    this.selectedCar = car;
  }

}
