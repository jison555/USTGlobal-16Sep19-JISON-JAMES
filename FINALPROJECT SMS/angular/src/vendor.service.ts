import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class VendorService {

  constructor(private http:HttpClient) { }
  viewProduct():Observable<any>{
   return this.http.get<any>(`http://localhost:8080/view-product`);
  }
  addCart(form):Observable<any>{
    return this.http.post<any>(`http://localhost:8080/add-cart`,form);

  }
  viewCart(){
    return this.http.get<any>(`http://localhost:8080/view-cart`)
  }
  addProduct(form){
    return this.http.post<any>(`http://localhost:8080/add-product`,form);
  }
  updateBook(form){
    return this.http.post<any>(`http://8080//klocalhost:8080/updatebook`,form);
  }
  deleteProduct(product){
    return this.http.post<any>(`http://localhost:8080/deletebook`,product);
  }
  

}
