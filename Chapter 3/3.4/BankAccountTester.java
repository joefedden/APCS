public class BankAccountTester
{
    public static void main (String [] args) {
        BankAccount acct1 = new BankAccount (1000);
        
        System.out.println("Before Interest: " + acct1.getBalance());
        acct1.addInterest(10);
        System.out.println("After 10% Interest: " + acct1.getBalance());
    }
}
