import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HardcodedAuthenticationService } from '../service/hardcoded-authentication.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username = "jluqueco";
  password = "";
  errorMessage = 'Invalid Credentials';
  invalidLogin = false;


  constructor(private router: Router, private harcodedAuthenticationService:HardcodedAuthenticationService) { }

  ngOnInit(): void {
  }

  handleLogin(){
    
    if (this.harcodedAuthenticationService.authenticate(this.username,this.password)){
      console.log(this.username);
      this.invalidLogin = false;
      this.router.navigate(['welcome', this.username]);
    }else{
      this.invalidLogin = true;
      console.log(this.username)
    }
  }

}
