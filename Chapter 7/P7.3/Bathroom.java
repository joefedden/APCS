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
        int newPos = 0;

        String[] stalls = new String[input];

        for (int i = 0; i < stalls.length; i++) {
            stalls[i] = "_";
        }

        stalls[startPos] = "X";

        for (String elements: stalls) {
            while(left > 0 && right < stalls.length) {
                if (left > right) {
                    stalls[newPos] = "X";
                    newPos = left/2;
                    left = newPos;
                } else {
                    stalls[newPos] = "X";
                    newPos = right + (right/2);
                    right = newPos;
                }
            }
            System.out.print(elements + " ");
        }
    }
}