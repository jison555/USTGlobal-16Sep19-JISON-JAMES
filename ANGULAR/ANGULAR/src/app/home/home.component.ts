import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';




@Component({
    selector :  'app-home',
    // template : `
    // <h1>header Component</h1> `,
    // styles : [`
    // h1{
    //     color : red;
    // }
    // `],
    templateUrl : './home.component.html',
    styleUrls : ['./home.component.css']
})

export class HomeComponent {
    news: any[];
    constructor(private http: HttpClient) {

        this.getNews();
    }

    getNews() {
        this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=4aa264fabd2f426f83cc06211f9285a0')
        .subscribe(data => {
            this.news = data.articles;
        }, err => {
            console.log(err);
        }, () => {
            console.log('news got successfully');
        });
    }
}
