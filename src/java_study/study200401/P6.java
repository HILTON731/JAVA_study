package java_study.study200401;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        final double TAX_RATE_LOW = 10.0/100.0;
        final double TAX_RATE_MID = 18.0/100.0;
        final double TAX_RATE_HIGH = 30.0/100.0;
        System.out.print("소득은? ");
        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble();
        double tax = 0.0;
        if(income>0){
            tax=income*TAX_RATE_LOW;
            if(income>3000){
                tax=3000*TAX_RATE_LOW+((income-3000)*TAX_RATE_MID);
                if(income>7000){
                    tax=3000*TAX_RATE_LOW+4000*TAX_RATE_MID+((income-7000)*TAX_RATE_HIGH);
                }
            }
        }
        System.out.printf("소득세 = %.2f",tax);

    }
}
