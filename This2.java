class This2
{
    String name;
    int age;
    void msg(String name)
    {
        this.name=name;
    }
    void msg1(String name,int age)
    {
        this.msg(name);
        this.age=age;
    }
    void display()
    {
        System.out.println(name+" "+age);
    }
}
class TestThe
{
    public static void main(String args[])
    {
        This2 t1=new This2();
        This2 t2=new This2();
        t1.msg1("Pooja",24);
        t2.msg1("Vinod",28);
        t1.display();
        t2.display();
    }
}
