function emp(firstName,lastName)
{
    this.firstName=firstName;
    this.lastName=lastName; 
}
emp.prototype.fullName=function()
{
    return this.firstName+" "+this.lastName
}
let e=new emp(101,"pooja");
console.log(e.fullName())
