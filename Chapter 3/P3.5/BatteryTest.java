public class BatteryTest {
    public static void main(String [] args) {
        Battery bat = new Battery(2000);
        
        bat.drain(1500);
        System.out.println("After loosing 75% charge: " + bat.getRemainingCapacity());
        bat.charge();
        System.out.println("After a full charge: " + bat.getRemainingCapacity());
    }
}