import { Component } from '@angular/core';
import { Product } from '../model/product';

@Component({
  selector: 'app-productlist-v1',
  standalone: true,
  imports: [],
  templateUrl: './productlist-v1.component.html',
  styleUrl: './productlist-v1.component.css'
})
export class ProductlistV1Component {

  products: Product[] =[];

  constructor(){
    this.products[0] = new Product(1,"HP Mouse","../../assets/images/HPMouse.JPG",250);
    this.products[1] = new Product(2,"iPhone","../../assets/images/Apple-Phone.JPG.JPG",50250);
    this.products[2] = new Product(3,"Dell Monitor","../../assets/images/dell.JPG",15250);
  }

}
