function Bike(name)
{
    this.name=name;
}
Bike.prototype.display=function()
{
    return this.name;
}
function Vehicle(price)
{
    this.price=price;
}
let b=new Bike("pulsar");
Vehicle.prototype=b;
//now vehicle is treated as child of bike
let v=new Vehicle(145000);
console.log(v.display()+" "+v.price)