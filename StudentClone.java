import java.lang.*;
class StudentClone implements Cloneable
{
    int id;
    String work;
    StudentClone(int id,String work)
    {
        this.id=id;
        this.work=work;
    }
    void show()
    {
        System.out.println(id+" "+work);
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
class TestClone
{
    public static void main(String args[])
    {
        try 
        {
            StudentClone s1=new StudentClone(1,"Reading");
            StudentClone s2=(StudentClone)s1.clone();
            s1.show();
            s2.show();           
        } catch (Exception e) 
        {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}