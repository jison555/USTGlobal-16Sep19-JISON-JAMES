import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-searchnews',
  templateUrl: './searchnews.component.html',
  styleUrls: ['./searchnews.component.css']
})
export class SearchnewsComponent implements OnInit {
  search;
  constructor(private service:UserService) {}
  selectedSearch(event){
    console.log(event.target.value);
    this.service.getSearch(event.target.value).subscribe(data=>{
      console.log(data);
      this.search=data.articles;
      },err=>{
        console.log(err);},()=>{
          console.log("data get successfully");
      });
  }
  ngOnInit() {
  }

}
