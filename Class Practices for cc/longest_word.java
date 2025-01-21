import java.util.Scanner;
public class longest_word{
    public static void main(String args[])
     {
Scanner a=new Scanner (System.in);
String m=a.nextLine();
    String res=new String();
String[] w=m.split(" ");
int max=0;
for(String i:w)
{
if(i.length()>max)
   {
   max=i.length();
            res=i;
   }
   
   }
   System.out.println(res);
     }
}
