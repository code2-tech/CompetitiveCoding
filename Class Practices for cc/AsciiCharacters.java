public class AsciiCharacters {
    public static void main(String[] args) {
        for (int i = 32; i <= 126; i++) { 
  char character = (char) i;  System.out.println("ASCII value: " + i + " -> Character: " + character);
        }
        int asciiValue = 65; 
        char specificCharacter = (char) asciiValue; 
        System.out.println("\nSpecific ASCII value: " + asciiValue + " -> Character: " + specificCharacter);
    }
}
