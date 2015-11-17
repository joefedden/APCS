import java.util.Scanner;

public class DataEquations {
    public static void main(String[] args) {
        Scanner basic = new Scanner(System.in);
        DataSet num = new DataSet();
        float input, sum = 0, average;
        int count = 0;
        
        do {
            System.out.println("Enter nums to find average and standard deviation (0 to quit): ");
            input = basic.nextFloat();
            
            if (input != 0) {
                num.add(input);
                count++;
            }
        } while (input != 0);
        
        num.getAverage(count);
        
        System.out.println("Average: " + num.printAverage());
    }
}
