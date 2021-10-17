public class Encapsulation1
{
    private String name;
    public String getName()
    {
        return name;
    }
    void setName(String name)
    {
        this.name=name;
    }
}
class TestEncap
{
    public static void main(String args[])
    {
        Encapsulation1 e1=new Encapsulation1();
        e1.setName("Vinod");
        System.out.println(e1.getName());
    }
}