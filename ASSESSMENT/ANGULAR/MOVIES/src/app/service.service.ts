import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  moviesUrl = 'http://www.omdbapi.com/?i=tt3896198&apikey=9d71b08e';

  constructor(public http:HttpClient) { }


  getUsers() {
    return this.http.get(`'http://www.omdbapi.com/?s=${}&apikey=9d71b08e'`);
  }






}
