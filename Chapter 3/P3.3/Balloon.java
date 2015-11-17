public class Balloon {
    private double radius = 0;
    
    public Balloon(double r) {
        radius = r;
    }
    
    public void inflate(double amount) {
        radius = radius + amount;
    }
    
    public double getVolume() {
        return (radius*radius*radius) * (4/3) * Math.PI;
    }
}