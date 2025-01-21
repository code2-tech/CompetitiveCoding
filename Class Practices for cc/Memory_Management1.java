class Memory_Management1
{
    void run(int i)
    {
        System.out.println(i);
        i++;
        run(i);
    }
    public static void main(String[] args)
    {
        int size=100;
        for(int i=0; i<Integer.MAX_VALUE; i++)
        {
            System.out.println(i);
            int[] arr=new int[size];
            size *=2;
        }
    }
}