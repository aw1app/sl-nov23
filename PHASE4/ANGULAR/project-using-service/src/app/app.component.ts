import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, RouterOutlet } from '@angular/router';
import { AddproductComponent } from './addproduct/addproduct.component';
import { ProductlistComponent } from './productlist/productlist.component';
import { Productlistv1Component } from './productlistv1/productlistv1.component';
import { HttpClientModule } from '@angular/common/http';
import { NosuchComponent } from './nosuch/nosuch.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet, HttpClientModule, RouterModule,
    AddproductComponent,
    ProductlistComponent,
    Productlistv1Component,
    NosuchComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'ECommerce Products';

  pi: number = 3.1415927;

  a: number = 0.12345;
  b: number = 1.09876;

  today = new Date();

  obj: Object = {
    name: { fName: "Paul", lName: "Shan" },
    site: "VoidCanvas", luckyNumbers: [7, 13, 69]
  };

  varX:boolean=true;
  // NgSwitch Directive demo start
  arr: number[] = [1, 2, 3];
  arrlen!: number;

  getLength(): number {
    this.arrlen = this.arr.length;
    return this.arr.length;
  }

  // NgSwitch Directive demo end  

}
