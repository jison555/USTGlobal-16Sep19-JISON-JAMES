import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
  name  = 'jison';
  imag = 'https://cdn.pixabay.com/photo/2019/09/22/16/20/location-4496459_960_720.png';
  address = 'kummunpuram(h), perumpanachy po, kottayam';
  colorName = 'red';
  isActive = false;
  colspanvalue = 2;

  constructor() {
    setInterval(() => {
      this.colorName = 'blue';
      this.isActive = ! this.isActive;
    } ,  2000);
  }

  ngOnInit() {
    setInterval(() => {
      this.colorName = 'green';
    }, 2000);
  }

}
