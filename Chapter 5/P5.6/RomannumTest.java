import java.util.Scanner;

public class RomannumTest {
    public static void main(String[] args) {
        Scanner cranner = new Scanner(System.in);
        System.out.println("**NOT FINISHED**");
        System.out.println("Enter a num between 0 & 3999: ");
        Romannum num1 = new Romannum(cranner.nextInt());
        
        int digit1 = num1.setFirstDigit();
        int digit2 = num1.setSecondDigit();
        int digit3 = num1.setThirdDigit();
        int digit4 = num1.setFourthDigit();
        
        
        System.out.println();
    }
}