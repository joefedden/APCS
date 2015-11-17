import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        Scanner MAV = new Scanner(System.in);
        double num1, num2, num3, num4;
        
        System.out.println("Enter a num: ");
        num1 = MAV.nextDouble();
        
        System.out.println("Enter another num: ");
        num2 = MAV.nextDouble();
        
        System.out.println("Enter another num: ");
        num3 = MAV.nextDouble();
        
        System.out.println("Enter another num: ");
        num4 = MAV.nextDouble();
        
        if ((num1 == num2 && num3 == num4) || (num1 == num3 && num2 == num4) || (num1 == num4 && num2 == num3)) {
            System.out.println("You have two pairs");
        } else if (num1 == num2 || num1 == num3 || num1 == num4 || num2 == num3 || num2 == num4 || num3 == num4) {
            System.out.println("You have one pair");
        } else {
            System.out.println("You have no pairs");
        }
        
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);
    }
}