class Aggregation1
{
    int id;
    String name;
    Emp2 emp;
    Aggregation1(int id,String name,Emp2 emp)
    {
        this.id=id;
        this.name=name;
        this.emp=emp;
    }
    void display()
    {
        System.out.println(id+" "+name);
        System.out.println(emp.city+" "+emp.state+" "+emp.country);
    }
}
class TestAgg
{
    public static void main(String args[])
    {
        Emp2 emp1=new Emp2("nzb","ts","India");
        Emp2 emp2=new Emp2("dichpally","ts","India");
        Aggregation1 a1=new Aggregation1(101,"pooja",emp1);
        Aggregation1 a2=new Aggregation1(102,"Vinod",emp2);
        a1.display();
        a2.display();

    }
}