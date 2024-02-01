import { Injectable } from '@angular/core';
import { Product } from './model/product';
import { HttpClient } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class Productv1Service {

  //JSON Server host URL
  backEndUrl: String = "http://localhost:3000/products";

  products: Product[] = [];

  httpClient!: HttpClient;

  constructor(httpClient: HttpClient) {
    this.httpClient = httpClient;
  }

  //SpringBoot integration
  getAllProductsFromSpringBootBackend(): Observable<Product[]> {
    return this.httpClient.get<Product[]>(`${this.backEndUrl}`);
  }

  getProductFromSpringBootBackend(id: number): Observable<Product> {
    return this.httpClient.get<Product>(`${this.backEndUrl}/${id}`);
  }

  newIdsStart:number=10000;

  addProduct(name: string, price: number): Observable<any>  {

    let id: number = this.newIdsStart++;   

    let prod: Product = new Product(id, name," ", price, true);

    const headers = { 'content-type': 'application/json' };
    const prodJSON = JSON.stringify(prod);

    return this.httpClient.post(`${this.backEndUrl}`, prodJSON, { 'headers': headers });
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
