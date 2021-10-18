class Super1
{
    int age;
    int salary;
    Super1(int age)
    {
        this.age=age;
    }
}    
class Person1 extends Super1
{
    Person1(int age,int salary)
    {
        super(age);
        this.salary=salary;   
    }
}    
class TestSuper
{
    public static void main(String args[])
    {
        Person1 p1=new Person1(28,40000);
        System.out.println(p1.age+" "+p1.salary);
    }
}