abstract class Abstraction1
{
    public int a=1,b=2,c;
    abstract void add();
    void run()
    {
        System.out.println("running safely");
    }
    static void eat()
    {
        System.out.println("eating");
    }
}
class Abstract extends Abstraction1
{
    void add()
    {
        c=a+b;
        System.out.println(c);
    }
}
class TestAbstract
{
    public static void main(String args[])
    {
        Abstract a1=new Abstract();
        a1.run();
        a1.add();
        Abstraction1.eat();
    }
}