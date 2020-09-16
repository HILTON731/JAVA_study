package java_study.study200418;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P7 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data3.txt"));
        int[] a1 = new int[sc.nextInt()];
        for(int i=0;i<a1.length;i++){
            a1[i]=sc.nextInt();
        }
        sc = new Scanner(new File("data4.txt"));
        int[] a2 = new int[sc.nextInt()];
        for(int i=0;i<a2.length;i++){
            a2[i]=sc.nextInt();
        }
        int[] sum = catArrays(a1,a2);
        printArrays(a1,"배열 1");
        printArrays(a2,"배열 2");
        printArrays(sum,"연결된 배열");
    }
    public static int[] catArrays(int[] a1, int[] a2){
        int[] a3 = new int[a1.length+a2.length];
        for(int i=0;i<a1.length;i++){
            a3[i]=a1[i];
        }
        for(int i=0;i<a2.length;i++){
            a3[i+a1.length]=a2[i];
        }
        return a3;
    }
    public static void printArrays(int[] a,String str){
        System.out.printf("%s:\t",str);
        for(int i=0;i<a.length;i++)
            System.out.printf("%d\t",a[i]);
        System.out.println();
    }
}
