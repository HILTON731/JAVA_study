package java_study.study200419;

import static java_study.study200419.P4.printArray;
import static java_study.study200419.P6.makeRandomArray;
import static java_study.study200419.P9.sort;

public class P10 {
    public static void main(String[] args) {
        System.out.printf("배열 a:");
        int[] array = makeRandomArray(5,5);
        printArray(array,array.length);
        sort(array,array.length);
        System.out.printf("정렬된 배열:");
        printArray(array,array.length);
        System.out.printf("binarrySearch(array,array.length,5): %d",binarySearch(array,array.length,5));
    }
    public static int binarySearch(int[] x, int n, int key){
        int low = 0;
        int high = n-1;
        int mid;
        while(high>=low){
            mid = (high+low)/2;
            if(key==x[mid])return mid;
            if(key<x[mid])high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
}
