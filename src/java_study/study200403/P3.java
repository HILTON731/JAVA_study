package java_study.study200403;

import java.lang.reflect.Array;
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        System.out.println("세 정수 중 가장 큰 수를 찾아줍니다.");
        System.out.println("세 개의 정수를 차례로 입력하시오:");
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        for(int i =0; i<3;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("세 정수 중 가장 큰 수는 "+maxfind(num)+"입니다.");
    }
    public static int maxfind(int[] num){
        int temp = num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]>temp)temp=num[i];
        }
        return temp;
    }
}
