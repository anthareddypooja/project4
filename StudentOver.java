class StudentOver
{
    int id;
    String name;
    int age;
    StudentOver(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    StudentOver(int id,String name,int age)
    {
        this(id,name);
        this.age=age;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+age);
    }
}
class TestOver
{
    public static void main(String args[])
    {
        StudentOver s1=new StudentOver(101,"PoojaReddy",24);
        StudentOver s2=new StudentOver(102,"VinodReddy",28);
        s1.display();
        s2.display();
    }
}