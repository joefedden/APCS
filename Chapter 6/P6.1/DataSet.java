public class DataSet {
    private double sum, average;
    
    public DataSet() {
        
    }
    
    public void add(double value) {
        sum = sum + value;
    }
    
    public void getAverage(int count) {
        average = sum / count;
    }
    
    public double printAverage() {
        return average;
    }
}
