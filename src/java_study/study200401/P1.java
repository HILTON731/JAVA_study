package java_study.study200401;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        System.out.println("양수들의 평균을 구하는 프로그램입니다."+"\n"+"입력을 마치려면 0 이하의 수를 입력하시오");
        Scanner sc = new Scanner(System.in);
        double num;
        double sum=0;
        int count=0;
        while(true){
            System.out.print("숫자를 입력하시오: ");
            num=sc.nextDouble();
            if (num > 0) {
                sum+=num;
                count++;
            }else{
                break;
            }
        }
        if(sum>0){
            System.out.printf("평균 = %.2f",sum/count);
        }else{
            System.out.println("양수가 하나도 입력되지 않았습니다.");
        }
    }
}
