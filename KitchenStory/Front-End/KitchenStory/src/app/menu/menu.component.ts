import { Component, OnInit } from '@angular/core';
import { Observable, of } from 'rxjs';
import { User } from '../checkout/checkout.component';
import { UserDataService } from '../service/data/user-data.service';
import { HardcodedAuthenticationService } from '../service/hardcoded-authentication.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
  isUserLoggedIn: boolean = false;
  userAdmin: Observable<boolean> = of(false);

  constructor(public hardcodedAuthenticationService: HardcodedAuthenticationService, private userDataService: UserDataService) { }

  ngOnInit(): void {
    this.isUserLoggedIn = this.hardcodedAuthenticationService.isUserLoggedIn();
    this.userAdmin = this.userDataService.getUserAdmin();
  }

  isUserLoggedInM(){
    return this.hardcodedAuthenticationService.isUserLoggedIn();
  }

  isUserAdmin(){
    if(this.isUserLoggedIn){
      return this.userAdmin;
    }else{
      return false;
    }
  }

}
