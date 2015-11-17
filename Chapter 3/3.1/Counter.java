public class Counter{
    private int value;
    
    public Counter(int initialValue){
        value = initialValue;
    }
    
    public void click() {
        value = value + 1;
    }
    
    public int getValue() {
        return value;
    }
    
    public void reset() {
        value = 0;
    }
     
    public void undo() {
        value = value - 1;
        value = Math.max(value, 0);
    }
}
