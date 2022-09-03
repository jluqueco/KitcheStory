import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-total-confirmation',
  templateUrl: './total-confirmation.component.html',
  styleUrls: ['./total-confirmation.component.css']
})
export class TotalConfirmationComponent implements OnInit {
  username = '';
  constructor(private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.username = this.route.snapshot.params['username'];
  }

}
