import { Component, OnInit } from '@angular/core';
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
  //[
  //   new Item(1, 'Test item', 10.25, 'Fruit'),
  //   new Item(2, 'Test item 2',100.25,'Vegetable'),
  //   new Item(3,'Test item 3',1000.25,'Nut')
  // ]

  constructor(private itemDataService: ItemDataService) { }

  ngOnInit(): void {
    this.itemDataService.retrieveAllItems().subscribe(
      response => {
        console.log(response);
        this.items = response;
      }
    );
  }

}
