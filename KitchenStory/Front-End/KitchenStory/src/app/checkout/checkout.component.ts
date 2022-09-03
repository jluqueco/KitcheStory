import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ShoppingCartDataService } from '../service/data/shopping-cart-data.service';

export class ShoppingCart{
  constructor(
    public shoppingCartID: number,
    public user: User,
    public items: shoppingCartItem[]
  ){}
}

export class User{
  constructor(
    public id: number,
    public name: string,
    public lastName: string,
    public bithday: string,
    public admin: boolean,
    public username: string,
    public password: string
  ){}
}

export class Item{
  constructor(
    public itemID: number,
    public description: string,
    public price: number,
    public type: Type
  ){}
}

export class Type{
  constructor(
    public typeID: number,
    public description: string
  ){}
}

export class shoppingCartItem{
  constructor(
    public shoppingCartItemID: number,
    public item: Item,
    public quantity: number,
    public lineTotal: number
  ){}
}


@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.component.html',
  styleUrls: ['./checkout.component.css']
})
export class CheckoutComponent implements OnInit {
  name = '';
  total= 0.0;
  shoppingCart: ShoppingCart = {
    shoppingCartID: 0,
    items: [],
    user: {
      id: 0,
      name:'',
      lastName: '',
      bithday: '',
      admin: true,
      username: '',
      password: ''
    }
  };

  constructor(private route: ActivatedRoute, private shoppingcartDataService: ShoppingCartDataService, private router: Router) { }

  ngOnInit(): void {
    this.name = this.route.snapshot.params['username'];
    this.shoppingcartDataService.retriveShoppingCart().subscribe(
      response => {
       // this.shoppingCart = response;
        console.log(response.items[0].item.description);
        this.shoppingCart = response
      }
    );
  }

  shoppingCartTotal(){
    this.total = 0.0;
    for(var val of this.shoppingCart.items){
      this.total = this.total + val.lineTotal;
    }

    return this.total;
  }

  handleTotal(){
    this.router.navigate(['totalConfirmation', this.shoppingCart.user.username]);
  }


}
