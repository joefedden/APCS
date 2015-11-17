import java.util.Random;
import java.util.Scanner;

public class LetterSwap {
    public static void main(String[] args) {
        Scanner didntask = new Scanner(System.in);
        Random dyest = new Random();
        String input, first, middle, last, ifinal, jfinal, newWord;
        int inputLength, iposition, jposition, placeholder;
        
        System.out.println("Enter a word: ");
        input = didntask.next();
        
        for (int i = 0; i < input.length(); i++) {
            iposition = dyest.nextInt(input.length() - 1);
            jposition = dyest.nextInt(input.length() - iposition) + iposition + 1;
            
            if (iposition == 0 || iposition == 1) {
                first = "";
            } else {
                first = input.substring(0, iposition - 1);
            }
            
            middle = input.substring(iposition, jposition);
            
            if (jposition == input.length() || jposition == input.length() - 1) {
                last = input.substring(jposition);
            } else {
                last = input.substring(jposition + 1, input.length());
            }
            
            placeholder = iposition;
            iposition = jposition;
            jposition = placeholder;
            
            if (iposition == input.length()) {
                ifinal = input.substring(iposition);
            } else {
                ifinal = input.substring(iposition, iposition + 1);
            }
            
            if (jposition == input.length()) {
                jfinal = input.substring(jposition);
            } else {
                jfinal = input.substring(jposition, jposition + 1);
            }
            
            newWord = first + ifinal + middle + jfinal + last;
            
            System.out.println(newWord);
        }
    }
}