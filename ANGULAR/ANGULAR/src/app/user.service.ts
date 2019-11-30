import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  firebaseURL = 'https://ust-ty-8a888.firebaseio.com/';

  constructor(public http: HttpClient) { }


  postUser(data) {

    console.log('service =', data);
    return this.http.post(`${this.firebaseURL}/users.json` , data);


  }
  getUsers() {
    return this.http.get(`${this.firebaseURL}/users.json`).pipe(   // CONVERTING INTO ARRAY OF OBJECTS USING PIPE()
      map(data => {
        const newArray = [];
        for(const key in data) {                                   //for in loop
          newArray.push({...data[key], id : key});
        }
        return newArray;
      })
    );
  }
  deleteUser(id) {

    return this.http.delete( `${this.firebaseURL}/users/${id}.json`);

  }
  updateUser(id,data) {
    return this.http.put(`${this.firebaseURL}/users/${id}.json`, data);
  }



}


