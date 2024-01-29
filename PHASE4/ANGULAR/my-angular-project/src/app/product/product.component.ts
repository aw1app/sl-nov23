import { Component } from '@angular/core';

@Component({
  selector: 'product',
  standalone: true,
  imports: [],
  templateUrl: './product.component.html',
  styleUrl: './product.component.css'
})
export class ProductComponent {

  name:string  = "HP Mouse";
  price:number = 250;

}
