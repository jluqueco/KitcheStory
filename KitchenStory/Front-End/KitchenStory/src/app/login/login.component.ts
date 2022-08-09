import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

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


  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  handleLogin(){
    
    if (this.username === 'jluqueco' && this.password === '93wchsrs'){
      console.log(this.username);
      this.invalidLogin = false;
      this.router.navigate(['welcome', this.username]);
    }else{
      this.invalidLogin = true;
      console.log(this.username)
    }
  }

}
