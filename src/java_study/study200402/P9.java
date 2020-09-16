package java_study.study200402;

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        System.out.println("삼각형을 그리는 프로그램입니다.");
        System.out.printf("삼각형의 크기를 얼마로 할까요? ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i<num;i++){
            for(int j = 0; j<i;j++){
                System.out.printf(" ");
            }
            for(int j = num-i;j>0;j--){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
