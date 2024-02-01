import { Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { AddproductComponent } from './addproduct/addproduct.component';
import { Productlistv1Component } from './productlistv1/productlistv1.component';
import { ProductlistComponent } from './productlist/productlist.component';
import { NosuchComponent } from './nosuch/nosuch.component';
import { ProductV1Component } from './product-v1/product-v1.component';


export const routes: Routes = [

    { path: 'product-list-old', component: ProductlistComponent },
    { path: 'product-list-v1', component: Productlistv1Component },
    { path: 'add-product', component: AddproductComponent },
    { path: 'product/:productId', component: ProductV1Component },
    { path: '*', component: NosuchComponent }
    /*
 ,*/

];
