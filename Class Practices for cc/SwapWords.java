import java.util.Scanner;
public class SwapWords
{
    public static String swapWords(String inputString)
    {
        String[] words = inputString.split(" ");
        StringBuilder swappedString = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--)
        {
            swappedString.append(words[i]);
            if (i > 0)
            {
                swappedString.append(" ");
            }
        }
        return swappedString.toString();
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String swappedString = swapWords(inputString);
        System.out.println(swappedString);
        scanner.close();
    }
}
