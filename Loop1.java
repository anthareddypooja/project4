class Loop1
{
    public static void main(String args[])
    {
        int age=35,weigth=50;
        if(age>=18)
        {
            if(weigth>40)
            {
                System.out.println("eligible to donate blood");
            }
            else
            {
                System.out.println("not eligible");
            }
        }
        else
        {
            System.out.println("age must be greater than 18");
        }
    }
}