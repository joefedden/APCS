public class Reverse {
    public void reverseArr(int[] arr) {
        int last = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[last] - i;
        }
        
    }
    
    public void printArray(int[] arr) {
        for (int element: arr) {
            System.out.print(element + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Reverse rev = new Reverse();
        
        rev.printArray(arr);
        rev.reverseArr(arr);
        System.out.print("\n");
        rev.printArray(arr);
    }
}