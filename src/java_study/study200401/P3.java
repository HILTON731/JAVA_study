package java_study.study200401;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        System.out.println("삼각형을 그리는 프로그램입니다.");
        System.out.print("삼각형의 크기를 얼마로 할까요? 1 이상의 정수를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
