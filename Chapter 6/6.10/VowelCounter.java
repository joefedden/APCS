import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner jesus = new Scanner(System.in);
        String input;
        int vowelCounter = 0;
        
        System.out.println("Enter a word: ");
        input = jesus.next();
        
        for (int i = 0; i < input.length(); i++) {
            if ((input.substring(i, i + 1).equalsIgnoreCase("a")) || 
                (input.substring(i, i + 1).equalsIgnoreCase("e")) || 
                (input.substring(i, i + 1).equalsIgnoreCase("i")) || 
                (input.substring(i, i + 1).equalsIgnoreCase("o")) || 
                (input.substring(i, i + 1).equalsIgnoreCase("u")) ||
                (input.substring(i, i + 1).equalsIgnoreCase("y"))) {
                    vowelCounter++;
            }
        }
        
        System.out.println("Number of vowels: " + vowelCounter);
    }
}