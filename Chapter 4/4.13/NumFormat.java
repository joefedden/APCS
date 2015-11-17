import java.util.*;

public class NumFormat {
    public static void main(String[] args) {
        Scanner happyBirthdayDrCozean = new Scanner(System.in);
        
        System.out.print("Enter a number between 1,000 & 999,999 w/o the comma: ");
        String num = happyBirthdayDrCozean.next();
        
        String beforeComma = num.substring(0, (num.length()-3));
        String afterComma = num.substring((num.length()-3), (num.length())); 
        
        System.out.println(beforeComma + "," + afterComma);
    }
}