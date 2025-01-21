import java.util.Scanner;
public class SimpleDeleteWords
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.print("Enter a word ");
        String Deleteword = scanner.nextLine();
        String resultString = inputString.replaceAll("\\b" + Deleteword + "\\b", "").trim().replaceAll(" +", " ");
        System.out.println(resultString);
        scanner.close();
    }
}
