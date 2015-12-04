import java.util.ArrayList;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        ArrayList<Integer> arrList = new <Integer>ArrayList();
        
        for (int i = 0; i < arr.length; i++) {
            int randNum = rand.nextInt(40) + 10;
            arr[i] = randNum;
        }
        
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arrList.add(arr[i]);
        }
        
        int total = 0, max = 0, min = arrList.get(0), lessThanCount = 0;
        float average;
        ArrayList<Integer> littleNums = new <Integer>ArrayList();
        for (int elements : arrList) {
            total += elements;
            
            if (elements < 25) {
                lessThanCount++;
                littleNums.add(elements);
            }
            if (elements > max) 
                max = elements;
                
            if (elements < min)
                min = elements;
        }
        average = (float) total / arrList.size();
        
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println(
            "\nArrayList: " + arrList + 
            "\nAverage: " + average + 
            "\nMax: " + max + 
            "\nMin: " + min +
            "\nCount of nums less than 25: " + lessThanCount + 
            "\nNums less than 25: " + littleNums
        );
    }
}