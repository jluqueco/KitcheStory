import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ItemDataService } from '../service/data/item-data.service';

export class Item{
  constructor(
    public id: number,
    public description: string,
    public price: number,
    public type: Type
  ){}
}

export class Type{
  constructor(
    public id: number,
    public description: string
  ){}
}

@Component({
  selector: 'app-list-items',
  templateUrl: './list-items.component.html',
  styleUrls: ['./list-items.component.css']
})
export class ListItemsComponent implements OnInit {
  public searchItem: any ='';
  query = '';
  
  items: Item[] = [];

  constructor(private itemDataService: ItemDataService, private router: Router) { }

  ngOnInit(): void {
    this.itemDataService.retrieveAllItems().subscribe(
      response => {
        console.log(response);
        this.items = response;
      }
    );
  }

  handlePurchase(){
    this.router.navigate(['checkout', 'jluqueco']);
  }

}
