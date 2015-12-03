public class RandomArray {
    private int[] randomList = new int[10];
    
    public void createList() {
        for (int i = 0; i < randomList.length; i++) {
            int randNum = (int) Math.round(Math.random() * 100);
            randomList[i] = randNum;
        }
    }
    
    public void printList(String input) {
        if (input.equals("evens")) {
            for (int i = 0; i < randomList.length; i++) {
                if (randomList[i] % 2 == 0)
                    System.out.print(randomList[i] + " ");
            }
        } else if (input.equals("reverse")) {
            for (int i = randomList.length - 1; i >= 0; i--) {
                System.out.print(randomList[i] + " ");
            }
        } else if (input.equals("firstandlast")) {
            System.out.println(randomList[0] + ", " + 
                               randomList[randomList.length - 1]);
        } else if (input.equals("evenIndex")) {
            for (int i = 0; i < randomList.length; i+=2) {
                System.out.print(randomList[i] + " ");
             }
        } else {
            for (int i = 0; i < randomList.length; i++) {
                 System.out.print(randomList[i] + " ");
        }
    }
}
   
    public static void main(String[] args) {
        RandomArray arr1 = new RandomArray();
        arr1.createList();
        
        System.out.print("List: ");
        arr1.printList("");
        
        System.out.print("\nEvenIndex: ");
        arr1.printList("evenIndex");
        
        System.out.print("\nEven: ");
        arr1.printList("evens");
        
        System.out.print("\nReverse: ");
        arr1.printList("reverse");
        
        System.out.print("\nFirst and Last: ");
        arr1.printList("firstandlast");
    }
}