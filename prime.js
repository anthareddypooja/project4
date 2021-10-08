let num=12;
let flag=0;
if(num==0 || num==1)
{
    console.log('not a prime');
}
else
{
for(let i=2;i<num;i++)
{
if(num%i==0)
{
    console.log('not a prime');
    flag=1;
    break;
}
}
}
if(flag==0)
{
    console.log('it is a prime')
}




