import { Component } from '@angular/core';
import { Product } from '../model/product';
import { Productv1Service } from '../productv1.service';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'productlistv1',
  standalone: true,
  imports: [CommonModule, HttpClientModule],
  templateUrl: './productlistv1.component.html',
  styleUrl: './productlistv1.component.css'
})
export class Productlistv1Component {

  products!: Product[];
  productService!: Productv1Service;

  constructor(productService: Productv1Service) {
    this.productService = productService;
  }

  ngOnInit(): void {

    this.productService.getAllProductsFromSpringBootBackend()
      .subscribe(
        products => this.products = products,
        error => console.error('Error fetching products:', error)
      );
  };

  

  deleteProduct = (id: number): void => {
    this.productService.deleteProduct(id)
      .subscribe(
        result => console.log(result),
        error => console.error('Error fetching products:', error)
      );

    this.productService.getAllProductsFromSpringBootBackend()
      .subscribe(
        products => this.products = products,
        error => console.error('Error fetching products:', error)
      );
  }

}
