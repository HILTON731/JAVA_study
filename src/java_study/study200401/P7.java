package java_study.study200401;

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(),count = sc.nextInt(),temp=num;
        for(int i=0;i<count;i++){
            System.out.printf("%d ^ %d = %d\n",num,i+1,temp);
            temp *=num;
        }
    }
}
