class Student10
{
    int id;
    String name;
    Student10(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    Student10(Student10 s)
    {
        id=s.id;
        name=s.name;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
}
class Test
{
    public static void main(String args[])
    {
        Student10 s1=new Student10(101,"Vinod");
        Student10 s2=new Student10(s1);
        s1.display();
        s2.display();
    }
}