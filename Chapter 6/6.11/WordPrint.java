import java.util.Scanner;

public class WordPrint {
    public static void main(String[] args) {
        Scanner mullet = new Scanner(System.in);
        String input;
        
        System.out.println("Enter a word: ");
        input = mullet.next();
        
        for (int i = 0; i < input.length(); i++) {
                System.out.println(input.substring(i, i + 1));
            }
        
        for (int i = 2; i <= input.length(); i++) {
            if (i < input.length()) {
                System.out.println(input.substring(0, i));
                System.out.println(input.substring(input.length()-i, input.length()));
            } else {
                System.out.println(input);
            }
        }
    }
}