let n=171;
let sum=0;
let temp=n;
while(n>0)
{
    let r=n%10;
    sum=(sum*10)+r;
    n=n/2;
}
if(sum==temp)
{
    console.log('it is palindrome')
}