import { Injectable } from '@angular/core';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';


@Injectable({
  providedIn: 'root'
})
export class LibraryserviceService {

  isAdmin = false;
  constructor(public http: HttpClient, private route: Router) { }
  adminLogin(form) {
    
    var id=form.value.id;
    var password=form.value.password;
    return this.http.post<any>(`http://localhost:8080/lms/adminlogin/${id}/${password}`, form.value).subscribe(data=>{
      console.log("data is ",data.adminBeans);
      if(data.adminBeans!=null){
        this.isAdmin = true;
        this.route.navigate(['adminHome'])
        console.log(this.isAdmin);
      }else{
        this.route.navigate(['adminlogin']);
      }
    }, err=>{
      console.log("data not found");
    }, ()=>{
      console.log("data")
    })
  }
  registerStudent(form){
    var response;
    return this.http.post<any>(`http://localhost:8080/lms/registerStudent`,form.value).subscribe(data=>{
      console.log("data is added",data)
      response=data.statusCode;
      console.log(response);
    },err=>{
      console.log("data is not added")
    }, ()=>{
      console.log("data")
    })
  }
}
