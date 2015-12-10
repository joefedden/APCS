import java.util.Scanner;

public class MethodsTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int randNum = (int) Math.round(Math.random() * 100);
            arr[i] = randNum;
        }
        ArrayMethods methods = new ArrayMethods(arr);
        
        System.out.print("Array: ");
        methods.printArray();
        
        System.out.print("\nSwapped: ");
        methods.swap();
        methods.printArray();
        
        System.out.print("\nShifted: ");
        methods.shift();
        methods.printArray();
        
        System.out.print("\nAll evens to zero: ");
        methods.evenToZero();
        methods.printArray();
        
        System.out.print("\nNeighbors: ");
        methods.neighbors();
        methods.printArray();
        
        System.out.print("\nMiddle num(s): ");
        methods.middle();
        methods.printArray();
        
        System.out.print("\nAll evens to the front: ");
        methods.evenToFront();
        methods.printArray();
        
        System.out.print("\nSecond largest num: ");
        methods.secondLargest();
        methods.printArray();
        
        System.out.println("\nIs sorted: " + methods.isSorted());
        System.out.println("Adjacent Dupes: " + methods.adjacentDupes());
        System.out.println("Dupes: " + methods.dupes());
        
    }
}