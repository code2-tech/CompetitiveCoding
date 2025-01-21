public class Digits {
    public static void main(String[] args) {
        System.out.println("Digits");
        for (int i = 48; i <= 57; i++) {
            char digit = (char) i; 
            System.out.print(digit + " "); 
        }
        System.out.println("\n\nSpecific Example:");
        int asciiValue = 48; 
        char specificDigit = (char) asciiValue; 
        System.out.println("ASCII value: " + asciiValue + " -> Digit: " + specificDigit);
    }
}	
