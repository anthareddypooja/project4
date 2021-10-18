class Static2
{
    static int a=10;
    static void show()
    {
        System.out.println(a);
    }
}
class TestStatic
{
    public static void main(String args[])
    {
        System.out.println(Static2.a);
        Static2.show();
    }
}