package java_study.study200331;

import java.util.Scanner;

public class sumAverage {
    public static void main(String[] args) {
        int score = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            score+=sc.nextInt();
        }
        System.out.println(score);
        System.out.printf("%.2f",(double)score/num);
    }
}
