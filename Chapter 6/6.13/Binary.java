import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner espanol = new Scanner(System.in);
        int input;
        
        System.out.println("Enter a number: ");
        input = espanol.nextInt();
        
        for (int i = 0; input != i;) {
            System.out.println(input % 2);
            input = input / 2;
        }
    }
}