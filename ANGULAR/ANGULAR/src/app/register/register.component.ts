import { Component, OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements  OnInit {
// , DoCheck, AfterViewInit, AfterViewChecked, OnDestroy {

  Users;
  selecteduser;


  constructor(public service: UserService) {
    this.getData();
    console.log('console is executed');
   }

              ngOnInit() {

                console.log('ngoninit is executed');
  }


loginData(form: NgForm) {

      console.log(form.value);
      this.service.postUser(form.value).subscribe(data => {
        console.log(data);
      }, err => {
        console.log(err);
      }, () => {
        console.log('data posted successfully');
      });

  }
  getData() {
    this.service.getUsers().subscribe(data => {
      console.log(data);
      this.Users = data;
    }, err => {
      console.log(err);
    }, () => {
      console.log('data got successfully');
    });
}

deleteData(user) {
  console.log(user);
  this.service.deleteUser(user.id).subscribe((data) => {
    console.log('deleted user', data);
  }, (err) => {
    console.log(err);
  }, () => {
    console.log('data deleted successfully');
  });
}

selectedUser(user) {
  console.log(user);
  this.selecteduser = user;
  console.log(this.selecteduser);
}

updateData(form) {
  console.log('update = ', form.value);
  this.service.updateUser(form.value.id, form.value).subscribe( data => {
    console.log(data);
  }, err => {
    console.log(err);
  }, () => {
    console.log('update data successfully');
  });

}
}









  //   ngDoCheck() {
  //     console.log('ngDoCheck is executed');
  //   }
  //   ngAfterViewInit() {
  //     console.log('ngAfterViewInit is executed');
  //   }
  //   ngAfterViewChecked() {
  //     console.log('ngAfterviewchecked() is executed');
  //   }
  //   ngOnDestroy() {
  //     console.log('ngonDistroy() is executed');
  //   }
