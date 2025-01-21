public class Memory_Management
{
    void run(int i)
    {
        System.out.println(i);
        i++;
        run(i);
    }
    public static void main(String[] args)
    {
        new Memory_Management().run(1);
    }
}
