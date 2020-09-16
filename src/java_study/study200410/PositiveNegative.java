package java_study.study200410;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        System.out.println("0을 입력함녀 프로그램이 끝납니다.");;
        int pos =0, neg=0;
        while(true) {
            System.out.print("정수를 입력하시오: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if(num>0){
                pos++;
            }
            else if(num<0){
                neg++;
            }
            else{
                break;
            }
        }
        System.out.println("양수 "+pos+"개");
        System.out.println("음수 "+neg+"개");
    }
}
