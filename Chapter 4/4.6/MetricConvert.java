import java.util.Scanner;

public class MetricConvert {
    public static void main(String[] args) {
        Scanner gabaghoul = new Scanner(System.in);
        double meters;
        double miles, feet, inches;
        
        final double METERSINMILE = 1609.34;
        final double FEETINMETER = 3.28084;
        final double INCHESINMETER = 39.3701;
        
        System.out.print("Enter a measurement in meters: ");
        meters = gabaghoul.nextDouble();
        
        miles = meters / METERSINMILE;
        feet = meters * FEETINMETER;
        inches = meters * INCHESINMETER;
        
        System.out.println("\nMiles: " + miles);
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
    }
}