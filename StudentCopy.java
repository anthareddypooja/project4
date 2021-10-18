class StudentCopy
{
    int id;
    String hobby;
    StudentCopy(int id,String hobby)
    {
        this.id=id;
        this.hobby=hobby;
    }
    StudentCopy()
    {}
    void show()
    {
        System.out.println(id+" "+hobby);
    }
}
class TestCopy
{
    public static void main(String args[])
    {
        StudentCopy s1=new StudentCopy(1,"singing");
        StudentCopy s2=new StudentCopy();
        s2.id=s1.id;
        s2.hobby=s1.hobby;
        s1.show();
        s2.show();
    }
}