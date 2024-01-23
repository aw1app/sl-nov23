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


//Object literals
/* Obj literal in JS
let bus1 = {
    name:"Tata",
    model:2022
};
*/

//in TS
let bus1: {name:string, model:number } = {
    name:"Tata",
    model:2022
};

//Enum Data type in TS 
enum ModelYear { Year2020=1990, Year2021, Year2022, Year2023 }

class Bike{
    name:string;
    mileage:number;
    modelYr:ModelYear;

    constructor(name:string, mileage:number,modelYr:ModelYear  ){
        this.name=name;
        this.mileage=mileage;
        this.modelYr=modelYr;
    }
}

let bike1 : Bike =  new Bike("Bullet", 100, 1992 );
//let bike2 : Bike =  new Bike("Bullet", 100, 2014 ); 
let bike3 : Bike =  new Bike("Bullet", 100, ModelYear.Year2023 );

// Union Type
let myVar: number | string
myVar=10
myVar="hello"

let myVar1: boolean | string
myVar1=true
myVar="hello"

let myVar3: number | string | Person 
myVar3=10
myVar3="hello"
myVar3=10
myVar3= new Person("Sundar");

// Any type
let myVar4 : any;
myVar4=10
myVar4="hello"
myVar4=10
myVar4= new Person("Sundar");
myVar4= new Car("Maruti", 60);
