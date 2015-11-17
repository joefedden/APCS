import java.util.Random;

public class NumRacer {
    public static void main(String[] args) {
        Random AHHH = new Random();
        
        int num1 = AHHH.nextInt();
        int num2 = AHHH.nextInt();
        int num3 = AHHH.nextInt();
        int num4 = AHHH.nextInt();
        int num5 = AHHH.nextInt();
        
        while (num1 != num2 && num2 != num3 && num3 != num4 && num4 != num5) {
            num1 = AHHH.nextInt();
            num2 = AHHH.nextInt();
            num3 = AHHH.nextInt();
            num4 = AHHH.nextInt();
            num5 = AHHH.nextInt();
            
            System.out.println(num1 + " " + 
                               num2 + " " + 
                               num3 + " " + 
                               num4 + " " +
                               num5);
        }
    }
}