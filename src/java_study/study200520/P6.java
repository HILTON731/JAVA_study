package java_study.study200520;

public class P6 {
    private double balance;

    public P6(){
        balance = 0.0;
    }
    public P6(double initialBalance){
        balance = initialBalance;
    }
    public void deposit(double amount){
        balance = balance + amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }
    public double getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        P6 myAccount1 = new P6(1000.0);
        myAccount1.deposit(500.0);
        myAccount1.withdraw(100.0);
        System.out.println(myAccount1.getBalance());
        P6 myAccount2 = new P6(1000.0);
        myAccount2.deposit(500.0);
        myAccount2.withdraw(100.0);
        System.out.println(myAccount2.getBalance());
    }
}
