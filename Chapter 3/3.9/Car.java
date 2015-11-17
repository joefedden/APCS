public class Car {
    private double mpg;
    private double fuel;
    
    public Car(double m) {
        mpg = m;
        fuel = 0;
    }
    
    public void drive(double distance) {
        fuel = fuel - (distance/mpg);
    }
    
    public void addGas(double newFuel) {
        fuel = fuel + newFuel;
    }
    
    public double getGasInTank() {
        return fuel;
    }
}