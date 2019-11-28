import { Component, OnInit } from '@angular/core';

import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {

  values:any=[];

  constructor(public http :HttpClient) { }

  ngOnInit() {
  }

  sendData(event) {
      console.log(event.target.value);

      console.log(this.values);
      this.http.get<any>(`http://www.omdbapi.com/?s=${event.target.value}&apikey=9d71b08e`).subscribe(data=>{
        this.values=data.Search;
      },err=>{},()=>{
        console.log("dataget successfully");
      });
  }


  

}
