import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner twy = new Scanner(System.in);
        char relationshipStatus;
        double income, endTax = 0, tax = 0, taxPercentage, addedCost;
        
        System.out.print("Are you (M)arried or (S)ingle? > ");
        relationshipStatus = twy.next().toLowerCase().charAt(0);
        
        System.out.print("What is your taxable income? > ");
        income = twy.nextDouble();
        
        if (relationshipStatus == 's') {
            if (income >= 0 && income < 8000) {
                taxPercentage = .10;
                tax = (income) * taxPercentage;
            } else if (income >= 8000 && income < 32000) {
                taxPercentage = .15;
                addedCost = 800;
                tax = (income - 8000) * taxPercentage;
            } else if (income >= 32000) {
                taxPercentage = .25;
                addedCost = 4400;
                tax = (income-32000) * taxPercentage;
            }
        } else if (relationshipStatus == 'm') {
            if (income >= 0 && income < 16000) {
                taxPercentage = .10;
                tax = (income * taxPercentage);
            } else if (income >= 16000 && income < 64000) {
                taxPercentage = .15;
                addedCost = 1600;
                tax = (income-16000) * taxPercentage;
            } else if (income >= 64000) {
                taxPercentage = .25;
                addedCost = 8800;
                tax = (income-64000) * taxPercentage; 
            }
        }
        
        System.out.println("Tax: " + tax);
    }
}