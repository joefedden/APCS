import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner eagle = new Scanner(System.in);
        int num;
        String star = "*";
        String space = " ";
        
        System.out.println("Enter a number: ");
        num = eagle.nextInt();
        
        for (int i = 0; i < num * 2; i+=2) {
            for (int j = 0; j < num - i/2; j++)
                System.out.print(space);
            
            for (int k = -1; k < i; k++)
                System.out.print(star);
            
            System.out.println(space);
        }
        
        for (int i = (num - 1) * 2; i > 0; i-=2) {
            for (int j = num + 1; j > i/2; j--)
                System.out.print(space);
            
            for (int k = 1; k < i; k++)
                System.out.print(star);
                
            System.out.println(space);
        }
    }
}
