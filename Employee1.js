class Employee1
{
    constructor()
    {
        this.id=12;
        this.name="vinod";
    }
}
class Programmer extends Employee1
{
    constructor(salary)
    {
        super();
        this.salary=salary;
    }
    display()
    {
        console.log(this.id+" "+this.name+" "+this.salary);
    }
    
}
let p1=new Programmer(100000);
p1.display();