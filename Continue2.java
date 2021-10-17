class Continue2
{
    public static void main(String args[])
    {
        int n=6;
        int i=0;
        while(i<n)
        {
            if(i==4)
            {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}