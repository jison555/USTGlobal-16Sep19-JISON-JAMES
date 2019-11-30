import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent implements OnInit {
  inputdata = '';

  constructor() { }

  ngOnInit() {
  }


printAlertMessage() {
  alert ('hai heloo');
}

dataInput(event) {
  console.log(event.target.value);
  this.inputdata = event.target.value;
}

}
