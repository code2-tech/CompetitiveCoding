import java.util.*;
import java.util.Scanner;
class starts_with_specific_char {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String s=sc.nextLine();
String e=sc.nextLine();
int flag=0;
String[] word=s.split(" ");
    for(String i:word){
       //System.out.println(i);
       if(i.startsWith(e)==true)
{
System.out.println(i);
flag=1;
}
    }
    if(flag==0)
    {
        System.out.println("no such word");
    }
 }
}
