import { Component, Input } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Product } from '../model/product';
import { Productv1Service } from '../productv1.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-product-v1',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './product-v1.component.html',
  styleUrl: './product-v1.component.css'
})
export class ProductV1Component {

  product!: Product;
  productService: Productv1Service;
  route!: ActivatedRoute;

  @Input('productId') productId!: string;

  constructor(productService: Productv1Service, route: ActivatedRoute) {
    this.productService = productService;
    this.route = route;
  }

  ngOnInit(): void {
    this.route.paramMap.subscribe(params => {      

      const productId = params.get('productId');
      
      if (productId !== null) {
        
        this.productId = productId;

        // Now you can use this.productId to fetch it from the Service
        this.productService.getProductFromSpringBootBackend(Number(this.productId)).subscribe(
          product => this.product = product,
          error => console.error('Error fetching product:', error)
        );
      }
    });
  }


}
