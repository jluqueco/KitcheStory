import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { User } from '../checkout/checkout.component';
import { UserDataService } from '../service/data/user-data.service';

@Component({
  selector: 'app-user-admin',
  templateUrl: './user-admin.component.html',
  styleUrls: ['./user-admin.component.css']
})
export class UserAdminComponent implements OnInit {
  users: User[] = [];
  constructor(private route: ActivatedRoute, private userDataService: UserDataService) { }

  ngOnInit(): void {
    this.userDataService.getUsers().subscribe(
      response => {
        console.log(response);
        this.users = response;
      }
    )
  }

}
