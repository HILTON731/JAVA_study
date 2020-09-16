package java_study.study200331;

import java.util.Scanner;

public class Decrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = num; i>=0;i--){
            System.out.printf("%d ",i);
        }
    }
}
