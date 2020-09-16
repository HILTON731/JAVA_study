package java_study.study200401;

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        double money=5000.0,input;
        while(true){
            num = sc.nextInt();
            switch(num) {
                case 1:
                    System.out.printf("잔액은 %f원입니다.", money);
                    break;
                case 2:
                    System.out.printf("입금");
                    input = sc.nextDouble();
                    money += input;
                    System.out.printf("%.2f", money);
                    break;
                case 3:
                    System.out.printf("인출");
                    input = sc.nextDouble();
                    if (money < input)
                        System.out.printf("돈이 모자릅니다.");
                    else {
                        money -= input;
                        System.out.printf("잔액은 %.2f", money);
                    }
                    break;
                case 4:
                    System.out.printf("thanks");
                    return;
                default:
                    System.out.printf("wrong number");
                    break;
            }
        }
    }
}
