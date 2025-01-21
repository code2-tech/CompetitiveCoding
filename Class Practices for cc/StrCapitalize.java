import java.util.*;
public class StrCapitalize
{
    public static String capitalizeWords(String inputString)
    {
        String[] words = inputString.split(" ");
        StringBuilder capitalizedString = new StringBuilder();
        for (String word : words)
        {
            if (word.length() > 0)
            {
                capitalizedString.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }
        return capitalizedString.toString().trim();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String capitalizedString = capitalizeWords(inputString);
        System.out.println( capitalizedString);
    }
}
