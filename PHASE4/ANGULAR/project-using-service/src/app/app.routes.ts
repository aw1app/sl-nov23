import { Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { AddproductComponent } from './addproduct/addproduct.component';
import { Productlistv1Component } from './productlistv1/productlistv1.component';
import { ProductlistComponent } from './productlist/productlist.component';


export const routes: Routes = [

    { path: 'home', component: AppComponent },
    { path: 'product-list', component: Productlistv1Component },
    { path: 'add-product', component: AddproductComponent },
    /*{ path: 'product/:productId', component: ProductlistComponent },
  { path: '*', component: NoSuchComponent },*/

];
