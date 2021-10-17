class Student2
{
    int id=18;
    String name="vinod";
void display()
{
    System.out.println(id+" "+name);
}
}
class School extends Student2
{
    int fee=10000;
    void display()
    {
        System.out.println( id+" "+name+" "+fee);
    }
}
class Board extends School
{
    String schoolName="SSP";
     void display()
    {
        System.out.println( id+" "+name+" "+fee+" "+schoolName);
    }
}
class TestStudent2
{
    public static void main(String args[])
    {
        Board b1=new Board();
        b1.display();
    }
}