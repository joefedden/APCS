import java.util.Scanner;

public class Theater {
    public static void main(String[] args) {
        Scanner finals = new Scanner(System.in);
        int input, input2, seatx = 0, seaty = 0;
        String seatCoord;
        int[][] theaterSeating = {
                {10,10,10,10,10,10,10,10,10,10},
                {10,10,10,10,10,10,10,10,10,10},
                {10,10,10,10,10,10,10,10,10,10},
                {10,10,20,20,20,20,20,20,10,10},
                {10,10,20,20,20,20,20,20,10,10},
                {10,10,20,20,20,20,20,20,10,10},
                {20,20,30,30,40,40,30,30,20,20},
                {20,30,30,40,50,50,40,30,30,20},
                {30,40,50,50,50,50,50,50,40,30}
            };

        for (int i = 0; i < theaterSeating.length; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(theaterSeating[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.print("Enter a price or seat row: ");
        input = finals.nextInt();

        if (input < 10) {
            System.out.print("\nEnter a column: ");
            input2 = finals.nextInt();
            if (theaterSeating[input][input2] == 0){
                System.out.println("Sorry, but this seat is occupied.");
            } else {
                seatCoord = "(" + input + ", " + input2 + ")";
                System.out.println("Your seat at " + seatCoord + " is $" + theaterSeating[input][input2]);
            }
        } else {
            for (int i = 0; i < theaterSeating.length; i++) {
                for (int j = 0; j < 10; j++) {
                    if (input == theaterSeating[i][j] && theaterSeating[i][j] != 0) {
                        seatx = i;
                        seaty = j;
                        j = 10;
                        i = theaterSeating.length;
                    }
                }
            }

            seatCoord = "(" + seatx + ", " + seaty + ")";

            System.out.println("Your seat is at " + seatCoord);
        }
    }
}