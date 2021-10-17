import java.lang.*;
class Conversions1
{
    public static void main(String args[])
    {
        int a=10;
        double d=10.2;
        String name="23";
        Integer i=12;
        long l=846;
        System.out.println("converting int to double");
        double m=a;
        System.out.println(m);
        System.out.println("converting double to int");
        int n=(int)d;
        System.out.println(n);
        System.out.println("converting String to int");
        int o=Integer.parseInt(name);
        System.out.println(o);
        System.out.println("converting Integer to int");
        int p=i.intValue();
        System.out.println(p);
        System.out.println("converting int to Integer");
        Integer q=Integer.valueOf(a);
        System.out.println(q);
        System.out.println("converting Long to double");
        double r=(double)l;
        System.out.println(r);
         System.out.println("converting Long to int");
        int s=(int)l;
        System.out.println(s);
    }    

}