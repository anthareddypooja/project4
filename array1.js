let a=[1,2];
for(let i=0;i<a.length;i++)
{
console.log(a[i])
}
let b=[2,3];
console.log("b elements are")
for(let i=0;i<b.length;i++)
{
    console.log(b[i])
}
let c=new Array();
console.log("c elements are")
for(let i=0;i<a.length;i++)
{
c[i]=a[i]+b[i];
console.log(c[i])
}