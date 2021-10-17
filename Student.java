class Student
{
    int id;
    String name;
    Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
}
class Test1
{
    public static void main(String args[])
    {
        Student s1=new Student(12,"pooja");
        Student s2=new Student(11,"vinod");
        s1.display();
        s2.display();
    }
}