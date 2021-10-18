interface Interface2
{
    static int a=10;
    final int b=9;
}
class A
{
    public static void main(String args[])
    {
        System.out.println(Interface2.a);
        System.out.println(Interface2.b);
    }
}