package java_study.study200331;

import java.util.Scanner;

public class Increase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        for(int i = 0; i<=num;i++){
            System.out.print(i+"\t");
            if(i%10==9) System.out.println();
//            count++;
//            if(count%10==0){
//                System.out.println();
//                count=0;
//            }
        }
    }
}
