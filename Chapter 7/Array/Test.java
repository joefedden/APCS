import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        int[] joe = new int[10];
        int[][] joeSquared = new int[10][2];
        ArrayList<Integer> joeList = new ArrayList<Integer>();
        
        for (int i = 0; i < joe.length; i++) {
            int randNum = (int) Math.round(Math.random() * 100);
            joeSquared[i][0] = randNum;
            joeSquared[i][1] = randNum + 1;
            joe[i] = randNum;
            System.out.println(joe[i]);
        }
        
        joe[0] = 1;
        System.out.println("");
        for (int i = 0; i < joe.length; i++) {
            System.out.println(joeSquared[i][0] + ", " + joeSquared[i][1]);
        }
    }
}