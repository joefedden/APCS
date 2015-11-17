import java.util.Scanner;

public class Conversions {
    public static void main(String[] args) {
        Scanner dan = new Scanner(System.in);
        
        double input;
        String inputUnit, outputUnit;
        
        System.out.print("Input a number to convert: ");
        input = dan.nextDouble();
        
        System.out.print("Enter a type of unit to convert from(fl. oz, gal, oz, lb, in, ft, mi): ");
        inputUnit = dan.next();
        
        System.out.print("Enter a type of unit to convert to(fl. oz, gal, oz, lb, in, ft, mi): ");
        outputUnit = dan.next();
    }
}