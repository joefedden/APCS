import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner pavilions = new Scanner(System.in);
        double income, tax;
        
        System.out.println("Enter income: ");
        income = pavilions.nextDouble();
        
        if (income <= 50000) {
            tax = income * .01;
        } else if (income > 50000 && income <= 75000) {
            tax = income * .02;
        } else if (income > 75000 && income <= 100000) {
            tax = income * .03;
        } else if (income > 100000 && income <= 250000) {
            tax = income * .04;
        } else if (income > 250000 && income <= 500000) {
            tax = income * .05;
        } else {
            tax = income * .06;
        }
        
        System.out.println("Tax: " + tax);
    }
}