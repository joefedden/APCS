import java.util.Scanner;

public class Bathroom {
    public static void main(String[] args) {
        Scanner soupy = new Scanner(System.in);
        System.out.println("Enter the # of stalls: ");
        int input = soupy.nextInt();
        boolean occupied = false;
        int startPos = (int) Math.floor(Math.random() * input);
        int left = startPos;
        int right = input - startPos;
        
        String[] stalls = new String[input];
        
        for (int i = 0; i < stalls.length; i++) {
            stalls[i] = "_";
        }
        
        stalls[startPos] = "X";
        
        if (left >= right) {
            stalls[left/2] = "X";
        } else {
            stalls[right/2] = "X";
        }
    }
}