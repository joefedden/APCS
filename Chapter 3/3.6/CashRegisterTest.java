public class CashRegisterTest {
    public static void main(String [] args){
        CashRegister reg = new CashRegister();
        
        reg.recordPurchase(5.0);
        reg.recordPurchase(15);
        reg.recordPurchase(27);
        
        reg.recievePayment(100);
        reg.giveChange();
        
        System.out.println(reg.printReceipt());
    }
}