package java_study.study200403;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        System.out.println("어떤 수보다 작거나 같은 최대 \"정수의 제곱수\"를 찾을까요?");
        System.out.println("음이 아닌 정수를 입력하시오.");
        System.out.println("음수를 입력하면 프로그램이 종료됩니다.");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.printf("입력: ");
            int num = sc.nextInt();
            if(num<0){
                System.out.println("프로그램이 끝났습니다.");
                System.exit(-1);
            }
            System.out.println("0보다 작거나 같은 최대 \"정수의 제곱수\"는 "+maxSquare(num)+"입니다.");
        }

    }
    public static int maxSquare(int bound){
        int temp=0;
        for(int i=0;i*i<=bound;i++){
            temp = i*i;
        }
        return temp;
    }
}
