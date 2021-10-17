class Student3
{
    void run()
    {
        System.out.println("running");
    }
}
class Pooja extends Student3
{
    void eat()
    {
        System.out.println("eating");
    }
}
class Vinod extends Student3
{
    void work()
    {
        System.out.println("working");
    }
}
class TestStudent3
{
    public static void main(String args[])
    {
        Vinod v1=new Vinod();
        Pooja p1=new Pooja();
        v1.work();
        p1.eat();
        v1.run();
    }
}