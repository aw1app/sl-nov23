export class Product {

    id: number = -1;

    productName: string = "HP Mouse";
    price: number = 250;

    productImage: string = "";

    constructor(id: number, productName: string, productImage: string, price: number) {
        this.id = id;
        this.productName = productName;
        this.productImage = productImage;
        this.price = price;
    }

}
