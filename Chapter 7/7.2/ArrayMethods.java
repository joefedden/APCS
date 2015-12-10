public class ArrayMethods {
    private int[] arr;

    public ArrayMethods (int[] arr) {
        this.arr = arr;
    }

    public void swap() {
        int placeholder = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = placeholder;
    }

    public void shift() {
        int placeholder = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[0] = placeholder;
    }

    public void evenToZero() {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = 0;
            }
        }
    }

    public void neighbors() {
        for (int i = 0; i < arr.length - 1; i++) {
            if (i == 0 || i == arr[arr.length - 1]) {
                if (arr[i] < arr[i+1]) {
                    arr[i] = arr[i+1];
                }
            }
        }
    }

    public void middle() {
        if (arr.length % 2 == 0) {
            int firstMid = (int) Math.floor(arr.length / 2);
            int lastMid = (int) Math.ceil(arr.length / 2);
            for (int i = firstMid; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            for (int i = lastMid; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
        } else {
            int mid = arr.length / 2;
            for (int i = mid; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
        }
    }

    public void evenToFront() {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 != 0) {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] % 2 == 0) {
                        arr[j] = arr[i];
                    }
                }
            }
        }
    }

    public int secondLargest() {
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
        } return secondLargest;   
    }

    public boolean isSorted() {
        boolean sorted = true;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] > arr[i+1]) {
                sorted = true;
            } else {
                sorted = false;
            }
        } return sorted;
    }

    public boolean adjacentDupes() {
        boolean dupes = false;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i+1]) {
                dupes = true;
            }
        } return dupes;
    }

    public boolean dupes() {
        boolean dupes = false;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == arr[i]) {
                    dupes  = true;
                }
            }
        } return dupes;
    }

    public void printArray() {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        } 
    }
}