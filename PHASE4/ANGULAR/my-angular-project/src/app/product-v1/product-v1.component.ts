import { Component, Input, OnChanges, OnInit } from '@angular/core';
import { Product } from '../model/product';

@Component({
  selector: 'product-v1',
  standalone: true,
  imports: [],
  templateUrl: './product-v1.component.html',
  styleUrl: './product-v1.component.css'
})
export class ProductV1Component implements OnInit, OnChanges {

  product!: Product;

  hidden:boolean=true;

  // Let's recieve the following inputs from the parent component
  @Input("name") name!:string
  @Input("image") image!:string
  @Input("price") price!:string
  @Input("inStock") inStock!:boolean
  
  // constructor(){
  //   this.product = new Product(1,"HP Mouse","../../assets/images/HPMouse.JPG",250);
  // }

  noOfLikes:number=0;

  addLike():void{
    this.noOfLikes++;
  }

  constructor(){ 
    console.log("INSIDE constructor of ProductV1Component");
  }

  ngOnChanges(): void {
    console.log("INSIDE ngOnChanges of ProductV1Component");
  }

  ngOnInit(): void {
    console.log("INSIDE ngOnInit of ProductV1Component");
    this.product = new Product(1,this.name,this.image,Number(this.price),this.inStock );
  }

  ngDoCheck(): void {
    console.log("INSIDE ngDoCheck of ProductV1Component ");
  }
  ngAfterContentInit(): void {
    console.log("INSIDE ngAfterContentInit of ProductV1Component");
  }
  ngAfterContentChecked(): void {
    console.log("INSIDE ngAfterContentChecked of ProductV1Component");
  }
  ngAfterViewInit(): void {
    console.log("INSIDE ngAfterViewInit of ProductV1Component ");
  }
  ngAfterViewChecked(): void {
    console.log("INSIDE ngAfterViewChecked of ProductV1Component ");
  }
  ngOnDestroy(): void {
    console.log("INSIDE ngOnDestroy of ProductV1Component");
  }


}
