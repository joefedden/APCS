import java.util.Scanner;

public class NumLength {
    public static void main(String [] args) {
        Scanner RIPnotefancy = new Scanner(System.in);
        long num, digits = 0;
        
        System.out.print("Enter an integer: ");
        num = RIPnotefancy.nextLong();
        
        if (num < 0) {
            num = num * -1;
        }
        
        if (num > 1000000000) {
            digits = 10;
        } else if (num >= 100000000) {
            digits = 9;
        } else if (num >= 10000000) {
            digits = 8;
        } else if (num >= 1000000) {
            digits = 7;
        } else if (num >= 100000) {
            digits = 6;
        } else if (num >= 10000) {
            digits = 5;
        } else if (num >= 1000) {
            digits = 4;
        } else if (num >= 100) {
            digits = 3;
        } else if (num >= 10) {
            digits = 2;
        } else if (num < 10) {
            digits = 1;
        }
        
        System.out.println("Digits: " + digits);
    }
}   