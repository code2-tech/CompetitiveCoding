import java.util.*;
import java.util.Scanner;
class each_word {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String s=sc.nextLine();
   String[] word=s.split(" ");
    for(String i:word){
       System.out.println(i);
    }
 }
}
