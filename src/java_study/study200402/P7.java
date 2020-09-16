package java_study.study200402;

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        while(true) {
            System.out.println("정해진 구간의 짝수들의 합을 구합니다.");
            System.out.print("두 개의 정수를 입력하시오: ");
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt(), num2 = sc.nextInt(),temp;
            if(num1>num2){
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
            getEvenSum(num1,num2);
            System.out.println();
        }
    }
    public static void getEvenSum(int from, int to){
        int sum=0;
        for(int i = from;i<=to;i++)
            if(i%2==0) {
                sum += i;
            }
        System.out.printf("%d부터 %d까지의 짝수의 합 = %d\n",from,to,sum);
    }
}
