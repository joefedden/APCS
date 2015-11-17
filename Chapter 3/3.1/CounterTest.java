public class CounterTest {
    public static void main(String [] args) {
        Counter count = new Counter(0);
        
        for (int i = 0; i < 10; i++) {
            count.click();
        }
        
        System.out.println("Clicked 10 times: " + count.getValue());
        count.undo();
        System.out.println("Undo by 1: " + count.getValue());
        count.reset();
        System.out.println("Reset: " + count.getValue());
    }
}