public class CarTest {
    public static void main (String [] args) {
        Car gti = new Car(30);
        
        gti.addGas(13.7);
        System.out.println("Full Tank: " + gti.getGasInTank());
        gti.drive(100.0);
        System.out.println("After a 100 mile drive: " + gti.getGasInTank());
    }
}
