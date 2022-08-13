import { Component, OnInit } from '@angular/core';

export class Item{
  constructor(
    public id: number,
    public description: string,
    public price: number,
    public type: string
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
  
  items = [
    new Item(1, 'Test item', 10.25, 'Fruit'),
    new Item(2, 'Test item 2',100.25,'Vegetable'),
    new Item(3,'Test item 3',1000.25,'Nut')
  ]

  constructor() { }

  ngOnInit(): void {
  }

}
