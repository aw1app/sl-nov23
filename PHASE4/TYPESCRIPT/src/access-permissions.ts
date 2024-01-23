
class Bus{
    name:string;
    private mileage:number;
    protected age:number;

    readonly engineType: string;

    constructor(name:string, mileage:number , age:number, engineType: string){
        this.name=name;
        this.mileage=mileage;
        this.age=age;
        this.engineType= engineType;
    }

    showMileage = ():number => this.mileage; 
}

let bus3 : Bus = new Bus("ford",100, 90, "petrol"); // in TS

//console.log(`Mileage is ${bus3.mileage}`); // ERROR mileage is private
console.log(`Mileage is ${bus3.showMileage()}`);

// bus3.engineType='Electric'; // ERROR engineType is readonly
