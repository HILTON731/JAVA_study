package java_study.study200414;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class P5 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("integers.txt"));
        int[] numbers = new int[10];
        int sum =0;
        for(int i =0; i<numbers.length;i++){
            numbers[i] = sc.nextInt();
            sum+=numbers[i];
            System.out.printf("배열의 첫 %d개 원소의 합: %d\n",i,sum);
        }
    }
}
