package java_study.study200414;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P3 {
    public static void main(String[] args)throws FileNotFoundException {
        Scanner sc = new Scanner(new File("integers.txt"));
        int [] numbers;
        numbers = new int[10];
        for(int i =0;i<10; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("배열을 역순으로 출력:");
        for(int i=numbers.length-1;i>-1;i--){
            System.out.printf("%d ",numbers[i]);
        }
        System.out.println();
        sc.close();
    }
}
