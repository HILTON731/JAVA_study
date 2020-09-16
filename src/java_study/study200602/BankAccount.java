package java_study.study200602;

public class BankAccount implements Measurable {
    private double balance;
    public BankAccount(double initialBalance){
        balance = initialBalance;
    }
    public void desposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }
    public double getBalance(){
        return balance;
    }
    public String toString(){
        return String.format("BankAccount[balance = %.1f]",balance);
    }

    @Override
    public double getMeasure() {
        return balance;
    }
}
