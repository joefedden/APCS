public class BankAccount {

    private double balance;
    private double fee;

    public BankAccount() {
        balance = 0;
        fee = 0;
    }

    public BankAccount(double initialBalance,double f) {
        balance = initialBalance;
        fee = f;
    }

    public void deposit(double amount) {
        balance = balance + amount + fee;
    }

    public void withdraw(double amount) {
        balance = balance - amount + fee;
    }
    
    public void addInterest(double rate) {
        balance = balance + ((rate/100) * balance);
    }

    public double getBalance() {
        return balance;
    }
} 