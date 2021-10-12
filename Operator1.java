class Operator1
{
    int a=12,b=13,c;
    int add()
    {
        c=a+b;
        return c;
    }
    void display()
    {
        System.out.println(c);
    }
}
class Test
{
    public static void main(String args[])
    {
        Operator1 op=new Operator1();
        op.add();
        op.display();
    }
}