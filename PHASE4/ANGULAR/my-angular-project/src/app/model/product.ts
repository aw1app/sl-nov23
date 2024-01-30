export class Product {

    id: number = -1;

    productName: string = "HP Mouse";
    price: number = 250;

    productImage: string = "";

    productInStock:boolean=true;

    constructor(id: number, productName: string, productImage: string, price: number, productInStock:boolean) {
        this.id = id;
        this.productName = productName;
        this.productImage = productImage;
        this.price = price;
        this.productInStock= productInStock;
    }

}
