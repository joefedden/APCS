import java.util.Scanner;

public class Order {
    public static void main(String [] args) {
        Scanner mobo = new Scanner(System.in);
        double num1, num2, num3;
        String order;
        
        System.out.print("Enter num1: ");
        num1 = mobo.nextDouble();
        
        System.out.print("Enter num2: ");
        num2 = mobo.nextDouble();
        
        System.out.print("Enter num3: ");
        num3 = mobo.nextDouble();
        
        if (num3 > num2 && num2 > num1) {
            order = "increasing";
        } else if (num1 > num2 && num2 > num3) {
            order = "decreasing";
        } else {
            order = "not increasing or decreasing";
        }
        
        System.out.println("The nums are " + order);
    }
}