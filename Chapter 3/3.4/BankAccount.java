public class BankAccount {

    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }
    
    public void addInterest(double rate) {
        balance = balance + ((rate/100) * balance);
    }

    public double getBalance() {
        return balance;
    }
} 