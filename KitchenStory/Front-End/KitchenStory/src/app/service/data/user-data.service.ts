import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from 'src/app/checkout/checkout.component';

@Injectable({
  providedIn: 'root'
})
export class UserDataService {
  
  constructor(private http: HttpClient) { }

  getUserAdmin(){
    return this.http.get<boolean>(`http://localhost:8080/users/1`);
  }

  getUsers(){
    return this.http.get<User[]>(`http://localhost:8080/users`);
  }
}
