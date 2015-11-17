public class RoachPopulation {
    private double size;
    
    public RoachPopulation(double s) {
        size = s;
    }
    
    public void breed() {
        Math.pow(size,2);
    }
    
    public void spray(double percent) {
        size = size - (size*(percent/100));
    }
    
    public double getRoaches() {
        return size;
    }
}