package java_study.study200414;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        System.out.println("정수 10개를 차례로 입력하시오:");
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        for(int i =0; i<10;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("배열을 역순으로 출력:");
        for(int i=9;i>=0;i--){
            System.out.printf("%d ", num[i]);
        }
    }
}
