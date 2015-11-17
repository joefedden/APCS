import java.util.Scanner;

public class StringPrinter
{
    public static void main(String[] args) {
        Scanner python = new Scanner(System.in);
        String input, vowel, _input = "";
        int inputLength, vowelCounter = 0;
        
        System.out.println("Enter a word: ");
        input = python.next();
        
        inputLength = input.length();
        
        //Uppercase Letters
        System.out.print("Uppercase: ");
        for (int i = 0; i < inputLength; i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                System.out.print(input.charAt(i) + " ");
            }
        }
        
        //Second Letter
        System.out.print("\nSecond letter: " + input.substring(1,2));
        
        _input = input;
        System.out.print("\nPosition of vowels: ");
        for (int i = 0; i < inputLength; i++) {
            if ((input.substring(i, i + 1).equalsIgnoreCase("a")) || 
                (input.substring(i, i + 1).equalsIgnoreCase("e")) || 
                (input.substring(i, i + 1).equalsIgnoreCase("i")) || 
                (input.substring(i, i + 1).equalsIgnoreCase("o")) || 
                (input.substring(i, i + 1).equalsIgnoreCase("u"))) {
                    vowel = _input.substring(i, i + 1);
                    _input = _input.replaceAll(vowel, "_");
                    vowelCounter++;
                    System.out.print(i + " ");
            }
        }
        
        System.out.println("\nNumber of vowels: " + vowelCounter);
        System.out.println("Vowels replaced with underscores " + _input);
    }
}
