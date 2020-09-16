package java_study.study200401;

import java.util.Arrays;
import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        System.out.print("세 개의 정수를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        if(a<b){
            if(a<c){
                if(b<c){
                    System.out.printf("%d %d %d",a,b,c);
                }else{
                    System.out.printf("%d %d %d",a,c,b);
                }
            }else{
                System.out.printf("%d %d %d",c,a,b);
            }
        }else{
            if(b<c){
                if(a<c){
                    System.out.printf("%d %d %d",b,a,c);
                }else{
                    System.out.printf("%d %d %d",b,c,a);
                }
            }else{
                System.out.printf("%d %d %d",c,b,a);
            }
        }
    }
}
