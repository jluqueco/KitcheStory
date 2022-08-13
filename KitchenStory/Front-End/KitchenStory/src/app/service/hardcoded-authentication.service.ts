import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HardcodedAuthenticationService {

  constructor() { }

  authenticate(username: string, password: string){
    console.log('before auth' + this.isUserLoggedIn());
    if (username === 'jluqueco' && password === '93wchsrs'){
      sessionStorage.setItem('authenticatedUser', username);
      console.log('before auth' + this.isUserLoggedIn());
      return true;
    }
    return false;
  }

  isUserLoggedIn(){
    let user = sessionStorage.getItem('authenticatedUser');

    return !(user===null)
  }
}
