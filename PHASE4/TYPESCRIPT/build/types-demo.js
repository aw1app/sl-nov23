"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
console.log(`\n Primitives Demo \n`);
// Decl an number (integer, decimal)
let x2 = 10;
// Decl a boolean
let knowsTypeScript = false;
// Decl a String
let myname = "Tom";
console.log(`Name is ${myname}`);
// 
console.log(`\n Non Primitives Demo \n`);
class Car {
    constructor(name, mileage) {
        this.name = name;
        this.mileage = mileage;
    }
}
let car1 = new Car("ford", 100); // in TS
console.log(`Car 1 name is ${car1.name}`);
const interface_demo_1 = require("./interface-demo");
let per10 = new interface_demo_1.Person("Mr President");
per10.walkFast();
// Arrays
console.log(`\n Array type Demo \n`);
let myArr1 = []; // in Plain JS
let myArr2 = []; // in TS
let myArr3 = []; // in TS
let carsArr = [];
carsArr[0] = new Car("ford", 100);
carsArr[1] = new Car("Maruti", 150);
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
let bus1 = {
    name: "Tata",
    model: 2022
};
//Enum Data type in TS 
var ModelYear;
(function (ModelYear) {
    ModelYear[ModelYear["Year2020"] = 1990] = "Year2020";
    ModelYear[ModelYear["Year2021"] = 1991] = "Year2021";
    ModelYear[ModelYear["Year2022"] = 1992] = "Year2022";
    ModelYear[ModelYear["Year2023"] = 1993] = "Year2023";
})(ModelYear || (ModelYear = {}));
class Bike {
    constructor(name, mileage, modelYr) {
        this.name = name;
        this.mileage = mileage;
        this.modelYr = modelYr;
    }
}
let bike1 = new Bike("Bullet", 100, 1992);
//let bike2 : Bike =  new Bike("Bullet", 100, 2014 ); 
let bike3 = new Bike("Bullet", 100, ModelYear.Year2023);
// Union Type
let myVar;
myVar = 10;
myVar = "hello";
let myVar1;
myVar1 = true;
myVar = "hello";
let myVar3;
myVar3 = 10;
myVar3 = "hello";
myVar3 = 10;
myVar3 = new interface_demo_1.Person("Sundar");
// Any type
let myVar4;
myVar4 = 10;
myVar4 = "hello";
myVar4 = 10;
myVar4 = new interface_demo_1.Person("Sundar");
myVar4 = new Car("Maruti", 60);
