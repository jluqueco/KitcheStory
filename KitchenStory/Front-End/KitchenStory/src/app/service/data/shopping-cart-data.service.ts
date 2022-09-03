import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ShoppingCart } from 'src/app/checkout/checkout.component';

@Injectable({
  providedIn: 'root'
})
export class ShoppingCartDataService {
  
  constructor(private http:HttpClient) { }

  retriveShoppingCart(){
    //console.log(this.http.get<ShoppingCart>(`http://localhost:8080/shoppingcart/1`));
    return this.http.get<ShoppingCart>(`http://localhost:8080/shoppingcart/1`);
  }
}
