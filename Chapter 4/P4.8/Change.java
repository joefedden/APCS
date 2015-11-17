public class Change {
    private static final int DOLLAR = 100;
    private static final int QUARTER = 25;
    private static final int DIME = 10;
    private static final int NICKEL = 5;
    private static final int PENNY = 1;
    
    private double moneyGiven, price, change;
    private double difference;
    private int dollars, quarters, dimes, nickels, pennies;
    
    public Change(double moneyGiven, double price) {
        this.moneyGiven = moneyGiven;
        this.price = price;
        difference = moneyGiven - price;
    }
    
    public void setDollars() {
        dollars = (int) difference / DOLLAR;
    }
    
    public void setQuarters() {
        quarters = (int) (difference - dollars) / QUARTER;
    }
    
    public void setDimes() {
        dimes = (int) (difference - (dollars + quarters)) / DIME;
    }
    
    public void setNickels() {
        nickels = (int) (difference - (dollars + quarters + dimes)) / NICKEL;
    }
    
    public void setPennies() {
        pennies = (int) (difference - (dollars + quarters + dimes + nickels));
    }
    
    public int getDollars() {
        return dollars;
    }
    
    public int getQuarters() {
        return quarters;
    }
    
    public int getDimes() {
        return dimes;
    }
    
    public int getNickels() {
        nickels = (int) (difference - (dollars - (quarters + dimes))) / NICKEL;
        return nickels;
    }
    
    public int getPennies() {
        return pennies;
    }
}