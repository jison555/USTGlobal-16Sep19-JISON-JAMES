import { Component, OnInit } from '@angular/core';
import { FormGroup, Validators, FormControl } from '@angular/forms';
import { LibraryserviceService } from 'src/app/libraryservice.service';

@Component({
  selector: 'app-regstudent',
  templateUrl: './regstudent.component.html',
  styleUrls: ['./regstudent.component.css']
})
export class RegstudentComponent implements OnInit {

  constructor(private service:LibraryserviceService) { }

  ngOnInit() {
  }

  
  get sname(){
    return this.form.get("sname");
  }
  
  get branch(){
    return this.form.get("branch");
  }
  get password(){
    return this.form.get("password");
  }
  get sem(){
    return this.form.get("sem");
  }
  get section(){
    return this.form.get("section");
  }
  get USN(){
    return this.form.get("USN");
  }
form=new FormGroup({
  sname : new FormControl('',[Validators.required]),
  password : new FormControl('',[Validators.required]),
  branch : new FormControl('',[Validators.required]),
  sem : new FormControl('',[Validators.required]),
  section : new FormControl('',[Validators.required]),
  USN :new FormControl('',[Validators.required])
})

addStudent(form) {
this.service.registerStudent(form);
console.log("data is",form.value)
}
}
