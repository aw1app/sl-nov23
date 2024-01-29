import { Component } from '@angular/core';
import { Product } from '../model/product';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'productlist-v1',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './productlist-v1.component.html',
  styleUrl: './productlist-v1.component.css'
})
export class ProductlistV1Component {

  products: Product[] =[];

  constructor(){
    this.products[0] = new Product(1,"HP Mouse","../../assets/images/HPMouse.JPG",250);
    this.products[1] = new Product(2,"iPhone","../../assets/images/Apple-Phone.JPG",50250);
    this.products[2] = new Product(3,"Dell Monitor","../../assets/images/dell.JPG",15250);
    this.products[3] = new Product(4,"Lenova Keyboard","https://5.imimg.com/data5/IA/UN/MY-3208689/lenovo-laptops-.png", 2500);
  }

}
