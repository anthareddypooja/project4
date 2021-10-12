class While1
{
    public static void main(String args[])
    {
        int n=1;
        //to print even numbers between 0 and 20
        while(n<10)
        {
          if(n==5)
           {
            n++;
            break;
           }
         System.out.println(n);
         n++;
        }
    }
}