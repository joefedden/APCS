import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        Scanner babadook = new Scanner(System.in);
        double gallons, mpg, price;
        double costPer100Miles, miles;

        System.out.print("Number of gallons in tank: ");
        gallons = babadook.nextDouble();

        System.out.print("\nMPG: ");
        mpg = babadook.nextDouble();

        System.out.print("\nprice of gas: ");
        price = babadook.nextDouble();

        costPer100Miles = (100/mpg) * price;
        miles = mpg * gallons;

        System.out.println("\nCost per 100 miles: $" + costPer100Miles);
        System.out.println("Miles on a full tank: " + miles);
    }
}