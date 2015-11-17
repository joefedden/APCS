import java.util.Scanner;

public class NumFormat {
    public static void main(String[] args) {
        Scanner happyBirthdayDrCozean = new Scanner(System.in);
        
        System.out.print("Enter a number between 1,000 & 999,999 w/ the comma: ");
        String num = happyBirthdayDrCozean.next();
        
        String numFixed = num.replaceAll("\\D", "");
        
        System.out.println("NUMBER WITHOUT COMMAS: " + numFixed);
    }
}