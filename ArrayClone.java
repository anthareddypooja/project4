import java.util.*;
class ArrayClone
{
    public static void main(String args[])
    {
        String a[]={"Pooja","Vinod"};
        System.out.println("Elements of a are:");
        for(String i:a)
        {
            System.out.println(i);
        }
        String b[]=a.clone();
        System.out.println("Elements of b are:");
        for(String j:b)
        {
            System.out.println(j);

        }
    }
}