import { Injectable } from '@angular/core';
import { Product } from './model/product';
import { HttpClient } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class Productv1Service {

  //SpringBoot project host URL
  backEndUrl: String = "http://localhost/product";

  products: Product[] = [];

  httpClient!: HttpClient;

  constructor(httpClient: HttpClient) {
    this.httpClient = httpClient;
  }

  //SpringBoot integration
  getAllProductsFromSpringBootBackend(): Observable<Product[]> 
  {
    return this.httpClient.get<Product[]>(`${this.backEndUrl}/list`);
  }

  deleteProduct = (id: number): Observable<string> => {   
    return this.httpClient.get<string>(`${this.backEndUrl}/delete-product/${id}`);
  };

  // getAllProducts(): Product[] {
  //   return this.products;
  // }

  // getProductById = (id: number): Product => this.products.filter(product => product.id === id)[0];


  // productIndex: number = 0;
  // //  Add a new product
  // addProduct = (name: string, price: number): number =>
  //   this.products.push(new Product(this.productIndex++, name, "../../assets/images/Apple-Phone.JPG", price, true));

  // deleteProduct = (id: number): void => {
  //   this.products = this.products.filter(product => product.id !== id);
  // };
}
