import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Item } from 'src/app/list-items/list-items.component';

@Injectable({
  providedIn: 'root'
})
export class ItemDataService {

  constructor(private http: HttpClient) { }

  retrieveAllItems(){
    return this.http.get<Item[]>(`http://localhost:8080/items`);
  }
}
