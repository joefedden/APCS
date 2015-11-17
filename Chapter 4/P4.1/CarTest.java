public class CarTest
{
    public static void main(String[] args) {
        Car gti = new Car(25000,10000,3.25, 25, 18000);
        
        System.out.println("Cost after 5 years: " + gti.costAfter5Years());
    }
}
