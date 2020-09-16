package java_study.study200331;

import org.opentutorials.javatutorials.io.Scanner2Demo;

import java.util.Scanner;

public class Decrease2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=(num%10)+1;
        for(int i = num;i>=0;i--){
            System.out.print(i+"\t");
            if(i%10==count) System.out.println();
        }
        System.out.println();
        int countA=0;
        for(int i=num;i>=0;i--){
            System.out.print(i+"\t");
            countA++;
            if(countA%10==0) System.out.println();
        }
    }
}
