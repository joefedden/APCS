public class Car {
    private double cost, milesPerYear, gasPrice, mpg, resale;
    private double costAfter5Years;
    
    public Car(double c, double mpy, double gp, double m, double r) {
        cost = c;
        milesPerYear = mpy;
        gasPrice  = gp;
        mpg = m;
        resale = r;
    }
    
    public double costAfter5Years() {
        costAfter5Years = (((milesPerYear / mpg) * gasPrice) * 5) + (cost-resale);
        return costAfter5Years;
    }
}