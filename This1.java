class This1
{
    int id;
    String name;
    This1(int id)
    {
        this.id=id;
    }
    This1(int id,String name)
    {
        this(id);
        this.name=name;
    }
}
class TestThis
{
    public static void main(String args[])
    {
        This1 t1=new This1(101,"PoojaVinodKumarReddy");
        System.out.println(t1.id+" "+t1.name);
    }
}