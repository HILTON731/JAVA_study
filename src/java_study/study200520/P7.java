package java_study.study200520;

public class P7 extends P6{
    private int accountNumber;
    private static int nextAccountNumber = 100;
    public P7(){
        super();
        accountNumber = nextAccountNumber++;
    }
    public P7(double initialBalance){
        super(initialBalance);
        accountNumber = nextAccountNumber++;
    }
    public void transfer(double amount, P7 other){
        other.deposit(amount);
        withdraw(amount);
        System.out.printf("%f원 계좌이체: %d --> %d\n",amount,accountNumber,other.accountNumber);
    }
    public String toString(){
        return new String("NumberedBanksAccount[accountNumber="+accountNumber
        +", balance="+getBalance()+"]");
    }

    public static void main(String[] args) {
        P7 account1 = new P7(1000.0);
        P7 account2 = new P7();

        account1.transfer(300.0, account2);
        System.out.println(account1.toString());
        System.out.println(account2.toString());
    }
}
