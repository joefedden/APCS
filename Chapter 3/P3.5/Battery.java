public class Battery {
    private double maxCapacity;
    
    public Battery(double capacity) {
        maxCapacity = capacity;
    }
    
    public void charge() {
        //Not sure how to get the original value.
    }
    
    public void drain(double amount) {
        maxCapacity = maxCapacity - amount;
    }
    
    public double getRemainingCapacity() {
        return maxCapacity;
    }
}