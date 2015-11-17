import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner whichfancy = new Scanner(System.in);
        int num;
        long a = 0;
        long b = 1;
        long c = 0;
        String ending;
        
        System.out.print("Enter nth digit of the Fibonacci sequence: ");
        num = whichfancy.nextInt();
        
        for (int i = 0; i < num; i++) {
           c = a + b;
           a = b;
           b = c;
        }
        
        if (num < 2) {
            ending = "st";
        } else if (num == 2) {
            ending = "nd";
        } else if (num == 3) {
            ending = "rd";
        } else {
            ending = "th";
        }
        
        System.out.println("The " + num + ending + " digit of fib is " + a);
    }
}
