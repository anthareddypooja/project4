let a=[1,2,3,4,5,6];
for(let i=0;i<a.length;i++)
{
    console.log(a[i])
}
a.push(3);
console.log("after invoking puch")
for(let i=0;i<a.length;i++)
{
    console.log(a[i])
}
a.pop();
console.log("after invoking pop")
for(let i=0;i<a.length;i++)
{
    console.log(a[i])
}
