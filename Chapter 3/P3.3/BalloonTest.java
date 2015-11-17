public class BalloonTest {
    public static void main(String [] args) {
        Balloon balloon1 = new Balloon(3);
        
        System.out.println("Before Inflation: " + balloon1.getVolume());
        balloon1.inflate(3);
        System.out.println("After Inflation: " + balloon1.getVolume());
    }
}