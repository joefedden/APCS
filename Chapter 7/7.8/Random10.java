import java.util.ArrayList;

public class Random10 {
    public static void main(String[] args) {
        ArrayList<Integer> ten = new <Integer>ArrayList();
        ArrayList<Integer> randTen = new <Integer>ArrayList();
        int randNum, num, multi = 10;

        for (int i = 1; i <= 10; i++) {
            ten.add(i);
        }
        
        for (int i = 0; i < 10; i++) {
            randNum = (int) Math.abs(Math.floor(Math.random() * multi));
            num = ten.get(randNum);
            randTen.add(i,num);
            ten.remove(randNum);
            multi--;
        }
        
        System.out.print(randTen);
    }
}