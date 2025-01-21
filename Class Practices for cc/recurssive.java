class recurssive
{
    static void pn(int n)
    {
        if(n == 5)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        pn(n+1);
    }
    public static void main(String a[])
    {
        pn(1);
    }
}