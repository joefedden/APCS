import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner jjbovi = new Scanner(System.in);
        String input;
        int inputLength;
        
        System.out.println("Enter a word: ");
        input = jjbovi.next();
        inputLength = input.length();
        
        
        for (int i = 0; i != inputLength; inputLength--) {
            System.out.print(input.substring(inputLength - 1, inputLength));
        }
    }
}