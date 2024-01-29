import { Component, Input, OnInit } from '@angular/core';
import { Product } from '../model/product';

@Component({
  selector: 'product-v1',
  standalone: true,
  imports: [],
  templateUrl: './product-v1.component.html',
  styleUrl: './product-v1.component.css'
})
export class ProductV1Component implements OnInit {

  product!: Product;

  // Let's recieve the following inputs from the parent component
  @Input("name") name!:string
  @Input("image") image!:string
  @Input("price") price!:string
  
  // constructor(){
  //   this.product = new Product(1,"HP Mouse","../../assets/images/HPMouse.JPG",250);
  // }

  constructor(){    
  }

  ngOnInit(): void {
    this.product = new Product(1,this.name,this.image,Number(this.price));
  }

}
