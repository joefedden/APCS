public class CashRegister {
    
    private double purchase;
    private double payment;
    private double change = payment - purchase;
    
    public CashRegister() {}
    
    public void recordPurchase(double amount) {
        purchase = purchase + amount;
    }
    
    public void recievePayment(double amount) {
        purchase = payment + amount;
    }
    
    
    public double giveChange() {
        purchase = 0;
        payment = 0;
        return change;
    }
    
    public double printReceipt() {
        String pur = String.valueOf(purchase);
        String pay = String.valueOf(payment);
        
        return "Purchase: " + pur + "\nPayment: " + pay;
    }
}