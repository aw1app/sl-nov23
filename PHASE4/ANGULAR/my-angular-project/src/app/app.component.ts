import { CommonModule } from '@angular/common';
import { Component, OnChanges, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ProductV1Component } from './product-v1/product-v1.component';
import { ProductComponent } from './product/product.component';
import { ProductlistV1Component } from './productlist-v1/productlist-v1.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet,
    ProductComponent,
    ProductV1Component,
    ProductlistV1Component],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit, OnChanges {
  title = 'ECommerce Products';
  inStockValFromParent:boolean=true;

  constructor() {
    console.log("INSIDE constructor");
  } 

  ngDoCheck(): void {
    console.log("INSIDE ngDoCheck");
  }
  ngAfterContentInit(): void {
    console.log("INSIDE ngAfterContentInit");
  }
  ngAfterContentChecked(): void {
    console.log("INSIDE ngAfterContentChecked");
  }
  ngAfterViewInit(): void {
    console.log("INSIDE ngAfterViewInit");
  }
  ngAfterViewChecked(): void {
    console.log("INSIDE ngAfterViewChecked");
  }
  ngOnDestroy(): void {
    console.log("INSIDE ngOnDestroy");
  }

  ngOnChanges(): void {
    console.log("INSIDE ngOnChanges");
  }

  ngOnInit(): void {
    console.log("INSIDE ngOnInit");
  }

}
