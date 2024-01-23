interface Human{
    name:string;

    walkFast():void ;
}

class Person implements Human{
    name:string;

    constructor(name:string){
        this.name = name;
    }

    walkFast():void {
        console.log("Walking ...., fast walking");
    }
};
