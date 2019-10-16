import { Component, OnInit } from '@angular/core';
import { Validators, FormControl, FormGroup } from '@angular/forms';
import { CustomValidation } from './customvalidation';

@Component({
  selector: 'app-reactiveform',
  templateUrl: './reactiveform.component.html',
  styleUrls: ['./reactiveform.component.css']
})
export class ReactiveformComponent implements OnInit {



  get add() {
    return this.form.get('add');
  }
  get title() {
    return this.form.get('title');
  }
  get url() {
    return this.form.get('url');
  }
  
  get desc() {
    return this.form.get('desc');
  }
  
  
    form = new FormGroup({
      add : new FormControl('' , [Validators.required, CustomValidation.unique]),
      title : new FormControl('' , [Validators.required]),
      url : new FormControl('' , [Validators.required]),
      desc : new FormControl('' , [Validators.required])
    });
  
    constructor() { }
  
    ngOnInit() {
    }


    loginData(form) {
      console.log(form);
    }
  

}