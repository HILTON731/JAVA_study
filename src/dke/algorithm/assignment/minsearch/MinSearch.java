package dke.algorithm.assignment.minsearch;

import java.util.Random;
import java.util.Scanner;

public class MinSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int size = sc.nextInt();
        int[] temp = getNumber(size);
        System.out.println("Array Created");
        for(int value : temp)
            System.out.println(value);
        System.out.print("Boundary of Min: ");
        int bound = sc.nextInt();
        printBoundary(temp, bound);
    }
    private static int[] getNumber(int size) {
        Random rand = new Random();
        int[] temp = new int[size];
        for (int i = 0; i < size; i++) {
            temp[i] = rand.nextInt(100);
        }
        return temp;
    }
    private static void printBoundary(int[] array, int bound){
        MergeSort.mergeSort(array, 0, array.length - 1);
        for(int i = 0; i<bound; i++)
            System.out.printf("%d ", array[i]);
    }
}
class MergeSort{
    public static void mergeSort(int[] array, int start, int end){
        int mid = (start + end) / 2;
        if(start<end) {
            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);
            merge(array, start, mid, end);
        }
    }
    public static void merge(int[] array, int start,int mid, int end){
        int l = start;
        int r = mid + 1;
        int k = start;

        int[] temp = new int[array.length];

        while(l<mid + 1 && r<end+1){
            if(array[l]<array[r]) {
                temp[k] = array[l++];
            } else {
                temp[k] = array[r++];
            }
            k++;
        }
        while(l<mid + 1)
            temp[k++] = array[l++];
        while(r<end+1)
            temp[k++] = array[r++];
        int i = 0;
        for(int index=start; index<k; index++){
            array[index] = temp[index];
        }
    }
}
