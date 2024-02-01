import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { ProductService } from '../product.service';
import { Productv1Service } from '../productv1.service';

@Component({
  selector: 'addproduct',
  standalone: true,
  imports: [CommonModule, FormsModule, ReactiveFormsModule],
  templateUrl: './addproduct.component.html',
  styleUrl: './addproduct.component.css'
})
export class AddproductComponent {

  productForm!: FormGroup;

  // productService!: ProductService;
  productService!: Productv1Service;

  constructor(productService: Productv1Service, private fb: FormBuilder) {

    this.productService = productService;

    this.productForm = this.fb.group(
      {
        productName: ['', [Validators.required, Validators.minLength(3)]],
        productPrice: ['', [Validators.required, Validators.pattern(/^\d+(\.\d{1,2})?$/), Validators.max(100000)]]
      }
    );

  }

  //addProduct= ():number =>  this.productService.addProduct(this.productForm.value.productName,this.productForm.value.productPrice);

  addProduct = (): void => {
    
    this.productService.addProduct(this.productForm.value.productName, this.productForm.value.productPrice)
    .subscribe();


  }


}
