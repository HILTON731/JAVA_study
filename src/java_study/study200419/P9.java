package java_study.study200419;

import java.util.Scanner;

import static java_study.study200419.P4.printArray;
import static java_study.study200419.P6.makeRandomArray;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("데이터 개수는? ");
        int num = sc.nextInt();
        int[] array = makeRandomArray(num, num);
        System.out.print("원 배열: ");
        printArray(array,num);

        System.out.print("정렬된 배열: ");
        sort(array,num);
        printArray(array,num);
    }
    public static void insert(int[] x, int i){
        int temp = x[i];
        int j=i-1;
        while(j>=0&&temp<x[j]){
            x[j+1]=x[j];
            j--;
        }
        x[j+1]=temp;
    }
    public static void sort(int[] x, int n){
        for(int i=1;i<n;i++)
            insert(x,i);
    }
}
