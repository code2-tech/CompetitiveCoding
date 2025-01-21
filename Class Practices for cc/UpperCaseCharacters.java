public class UpperCaseCharacters {
    public static void main(String[] args) {
        System.out.println("Uppercase characters:");
        for (int i = 65; i <= 90; i++) {
            char upperCaseChar = (char) i; 
            System.out.print(upperCaseChar + " "); 
     }
        System.out.println("\n\nSpecific Example:");
        int asciiValue = 65; 
        char specificCharacter = (char) asciiValue; 
        System.out.println("ASCII value: " + asciiValue + " -> Character: " + specificCharacter);
    }
} 
