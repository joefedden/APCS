public class SavingsAccount {

    private double balance;
    private double rate;

    public SavingsAccount() {
        balance = 0;
        rate = 0;
    }

    public SavingsAccount(double initialBalance, double interestRate) {
        balance = initialBalance;
        rate = interestRate;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }
    
    public void addInterest() {
        balance = balance + ((rate/100) * balance);
    }

    public double getBalance() {
        return balance;
    }
} 