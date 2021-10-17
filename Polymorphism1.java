class Polymorphism1
{
    void run()
    {
        System.out.println("running");
    }
}
class Poly extends Polymorphism1
{
    void run()
    {
        System.out.println("running safely");
    }
}
class TestPoly
{
    public static void main(String args[])
    {
        Polymorphism1 p1=new Poly();
        p1.run();
    }
}