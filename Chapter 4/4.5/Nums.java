import java.util.Scanner;

public class Nums {
    public static void main(String[] args) {
        Scanner joe = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        double num1 = joe.nextInt();
        
        System.out.println("Enter another number: ");
        double num2 = joe.nextInt();
        
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double average = (num1 + num2) / 2;
        double distance = Math.sqrt((Math.pow(num1,2) + Math.pow(num2,2)));
        double max = Math.max(num1,num2);
        double min = Math.min(num1,num2);
        
        System.out.printf("%nSum: %11.2f%n", sum);
        System.out.printf("Difference: %1.2f%n", difference);
        System.out.printf("Product: %7.2f%n", product);
        System.out.printf("Average: %7.2f%n", average);
        System.out.printf("Distance: %6.2f%n", distance);
        System.out.printf("Max: %11.2f%n", max);
        System.out.printf("Min: %11.2f", min);
    }
}