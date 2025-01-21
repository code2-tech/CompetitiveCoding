
public class LowerCaseCharacters {
    public static void main(String[] args) {
        System.out.println("Lowercase characters:");
        for (int i = 97; i <= 122; i++) {
 char lowerCaseChar = (char) i; System.out.print(lowerCaseChar + " "); 
   } System.out.println("\n\nSpecific Example:");
        int asciiValue = 97;
        char specificCharacter = (char) asciiValue; 
        System.out.println("ASCII value: " + asciiValue + " -> Character: " + specificCharacter);
    }
}
