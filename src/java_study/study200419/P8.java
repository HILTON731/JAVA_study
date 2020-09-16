package java_study.study200419;

import static java_study.study200419.P4.printArray;
import static java_study.study200419.P6.distinct;
import static java_study.study200419.P6.fillRandomDistinct;

public class P8 {
    public static void main(String[] args) {
        final int ALENGTH = 10;
        final int BLENGTH = 10;
        final int MAX = 20;

        int[] a = new int[ALENGTH];
        int[] b = new int[BLENGTH];

        int[] union = new int[ALENGTH + BLENGTH];
        int unionSize;

        int[] intersection;

        intersection = new int[ALENGTH];
        int intersectionSize;

        fillRandomDistinct(a, MAX);
        System.out.print("배열1: ");
        printArray(a, a.length);
        if (!distinct(a, a.length))
            System.out.println("엥? 배열에 중복된 원소가 있네!");

        fillRandomDistinct(b, MAX);
        System.out.print("배열2: ");
        printArray(b, b.length);
        if (!distinct(b, b.length))
            System.out.println("엥? 배열에 중복된 원소가 있네!");

        unionSize = unionArrays(a, b, union);
        System.out.print("Union: ");
        printArray(union, unionSize);
        if (!distinct(union, unionSize))
            System.out.print("엥? 배열에 중복된 원소가 있네!");

        intersectionSize = intersectionArrays(a, b, intersection);
        System.out.print("Intersection: ");
        printArray(intersection, intersectionSize);
        if (!distinct(intersection, intersectionSize))
            System.out.print("엥? 배열에 중복된 원소가 있네!");
    }
    public static int unionArrays(int[] a, int[] b, int[] union){
        int temp;
        int count =0;
        for(int i=0;i<a.length;i++){
            union[count++]=a[i];
        }
        for (int value : b) {
            temp = value;
            for (int j = 0; j < a.length; j++) {
                if (temp == union[j]) {
                    temp = 0;
                    break;
                }
            }
            if(temp!=0)
                union[count++]=temp;
        }
        return count;
    }
    public static int intersectionArrays(int[] a, int[]b, int[] intersection){
        int count=0;
        for(int i=0; i<a.length;i++){
            int temp = a[i];
            for(int j=0;j<b.length;j++){
                if(temp ==b[j]){
                    intersection[count++]=temp;
                    break;
                }
            }
        }
        return count;
    }
}
