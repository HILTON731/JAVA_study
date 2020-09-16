package java_study.study200331;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = 0;
        int i =1;
        while(max<=100){

            max = num*i;
            i++;
            if(max<=100)System.out.printf("%d ",max);
        }
    }
}
