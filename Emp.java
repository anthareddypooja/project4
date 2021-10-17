class Emp
{
    int id;
    String name;
    Emp(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}
class Programmer extends Emp
{
    int salary;
    Programmer(int id,String name,int salary)
    {
        super(id,name);
        this.salary=salary;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+salary);
    }
}
class Test
{
    public static void main(String args[])
    {
        Programmer p1=new Programmer(12,"vinod",40000);
        p1.display();
    }
}