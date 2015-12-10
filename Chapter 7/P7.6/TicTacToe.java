import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Init Scanner
        String[][] gameBoard = new String[3][3]; //Init gameboard array

        String playerX = "X"; 
        int xCoorX, yCoorX, count = 0;

        String playerO = "O";
        int xCoorO, yCoorO;

        boolean running = true;

        //Builds gameboard with #s
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameBoard[i][j] = "#";
            }
        }

        while (running) {
            //Prints Gameboard
            for (String[] grid: gameBoard) {
                for (String places: grid) {
                    System.out.print(places);
                }
                System.out.print("\n");
            }

            //Gets playerX's coords
            System.out.print("Player X corr1(x): ");
            xCoorX = scan.nextInt();
            System.out.print("\nPlayer X coor2(y): ");
            yCoorX = scan.nextInt();

            //Sets X position
            if (gameBoard[xCoorX][yCoorX].equals("#")) {
                gameBoard[xCoorX][yCoorX] = playerX;
            } else {
                System.out.println("That spot is taken");
            }

            //Prints Gameboard
            for (String[] grid: gameBoard) {
                for (String places: grid) {
                    System.out.print(places);
                }
                System.out.print("\n");
            }

            //Gets playerO's coords
            System.out.print("\nPlayer O coor1(x): ");
            xCoorO = scan.nextInt();
            System.out.print("\nPlayer O coor2(y): ");
            yCoorO = scan.nextInt();

            //Sets O position
            if (gameBoard[xCoorO][yCoorO].equals("#")) {
                gameBoard[xCoorO][yCoorO] = playerO;
            } else {
                System.out.println("That spot is taken");
            }

            if (count > 2) {
                if (gameBoard[0][0].equals(gameBoard[0][1]) && gameBoard[0][1].equals(gameBoard[0][2]) ||
                    gameBoard[1][0].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[1][2]) ||
                    gameBoard[2][0].equals(gameBoard[2][1]) && gameBoard[2][1].equals(gameBoard[2][2]) ||

                    gameBoard[0][0].equals(gameBoard[1][0]) && gameBoard[1][0].equals(gameBoard[2][0]) ||
                    gameBoard[0][1].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[2][1]) ||
                    gameBoard[0][2].equals(gameBoard[1][2]) && gameBoard[1][2].equals(gameBoard[2][2]) ||

                    gameBoard[0][0].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[2][2]) ||
                    gameBoard[0][2].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[2][0])) {
                    running = false;
                    
                    for (String[] grid: gameBoard) {
                        for (String places: grid) {
                            System.out.print(places);
                        }
                        System.out.print("\n");
                    }
                }
            }
            count++;
        }
    }
}