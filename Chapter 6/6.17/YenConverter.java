import java.util.Scanner;

public class YenConverter {
    public static void main(String[] args) {
        Scanner ihatemike = new Scanner(System.in);
        double dollarToYenVal, dollarVal, yenVal;
        
        System.out.print("Enter the value of yen equal to 1 U.S. dollar: ");
        dollarToYenVal = ihatemike.nextDouble();
        
        System.out.print("\nEnter a dollar amount to be converted to yen (Enter 0 to quit): ");
        dollarVal = ihatemike.nextDouble();
        
        while (dollarVal != 0) {
            yenVal = dollarVal * dollarToYenVal;
            System.out.println("Yen Value: " + yenVal);
            
            System.out.print("\nEnter a dollar amount to be converted to yen (Enter 0 to quit): ");
            dollarVal = ihatemike.nextDouble();
        }
    }
}