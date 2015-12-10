public class Sum {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int min, sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int randNum = (int) Math.round(Math.random() * 100);
            arr[i] = randNum;
        }

        min = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < min)
                min = arr[i];
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != min) 
                sum = sum + arr[i];
            
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nSum w/o min: " + sum);
    }
}