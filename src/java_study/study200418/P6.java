package java_study.study200418;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P6 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data1.txt"));
        int[] a1 = new int[10];
        System.out.printf("배열 1: ");
        for(int i=0; i<10;i++) {
            a1[i] = sc.nextInt();
            System.out.printf("%d\t",a1[i]);
        }
        System.out.println();
        sc = new Scanner(new File("data2.txt"));
        int[] a2 = new int[10];
        System.out.printf("배열 2: ");
        for(int i=0;i<10;i++) {
            a2[i] = sc.nextInt();
            System.out.printf("%d\t",a2[i]);
        }
        System.out.println();
        int[] sum = addArrays(a1, a2);
        System.out.printf("배열 합: ");
        for(int i=0;i<10;i++){
            System.out.printf("%d\t",sum[i]);
        }
    }
    public static int[] addArrays(int[] a1, int[] a2){
        int[] sum = new int[a1.length];
        for(int i =0 ;i<sum.length;i++)
            sum[i]=a1[i]+a2[i];
        return sum;
    }
}
