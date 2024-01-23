console.log(`\n Primitives Demo \n`);
// Decl an number (integer, decimal)
let x2:number =10;

// Decl a boolean
let knowsTypeScript:boolean = false;

// Decl a String
let myname:string = "Tom";

console.log(`Name is ${myname}`);


// 
console.log(`\n Non Primitives Demo \n`);
class Car{
    name:string;
    mileage:number;

    constructor(name:string, mileage:number ){
        this.name=name;
        this.mileage=mileage;
    }
}

let car1:Car = new Car("ford",100); // in TS

console.log(`Car 1 name is ${car1.name}`);

import {Person} from './interface-demo';

let  per10: Person = new Person("Mr President");
per10.walkFast();


// Arrays
console.log(`\n Array type Demo \n`);
let myArr1 = []; // in Plain JS

let myArr2 : string[] = []; // in TS

let myArr3 : number[] = []; // in TS

let carsArr: Car[] = [];
carsArr[0] = new Car("ford",100);
carsArr[1] = new Car("Maruti",150);
console.log(`\n Array type Demo \n ${carsArr}`);
console.log(`\n Array type Demo \n ${carsArr[0].name}`);
