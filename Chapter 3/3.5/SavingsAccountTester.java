public class SavingsAccountTester {
    public static void main (String [] args) {
        SavingsAccount acct1 = new SavingsAccount(4000,10);
        
        System.out.println("Before Interest: " + acct1.getBalance());
        acct1.addInterest();
        System.out.println("After Interest: " + acct1.getBalance());
    }
}