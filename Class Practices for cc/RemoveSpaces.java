import java.util.Scanner;
public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with spaces:");
        String input = scanner.nextLine();
        String stringWithoutSpaces = input.replaceAll(" ", "");
        System.out.println("String without spaces: " + stringWithoutSpaces);
        scanner.close();
    }
}

