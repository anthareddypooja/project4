import java.util.*;
class ArrayCopy1
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4};
        System.out.println("elements of a are");
        for(int i:a)
        {
            System.out.println(i);
        }
        int b[]=new int[a.length];
        b=Arrays.copyOf(a,a.length);
        System.out.println("elements of b are");
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
    }
}