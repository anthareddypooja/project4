import java.util.*;
interface Interface1
{
    public void print();
}
class Circle implements Interface1
{
    public void print()
    {
        System.out.println("Drawing a circle");
    }    
}
class Square implements Interface1
{
    public void print()
    {
        System.out.println("Drawing a Square");
    }    
}
class TestPrint
{
    public static void main(String args[])
    {
        Interface1 op1=new Circle();
        Interface1 op2=new Square();
        op1.print();
        op2.print();

    }
}