package dke.algorithm.assignment.binarysearch;

import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] temp = getNumber(100);
        int start = 0;
        int end = temp.length - 1;

        printNumber(temp);

        int num = sc.nextInt();

        while(start <= end){
            int mid = (int) (start + end) / 2;
            if(temp[mid] == num){
                System.out.println("your target number index is " + mid);
                break;
            } else if(temp[mid] < num){
                start = mid + 1;
            } else
                end = mid - 1;
        }

    }
    private static void printNumber(int[] temp){
        int t = 0;
        for(int i = 0; i< 5; i++){
            for(int j = 0; j<20; j++)
                System.out.printf("%d\t", temp[t++]);
            System.out.println();
        }
    }

    private static int[] getNumber(int size){
        Random rand = new Random();
        int[] temp = new int[size];
        for(int i = 0; i < size; i++){
            temp[i] = rand.nextInt(1000);
        }
        temp = MergeSort.mergeSort(temp);

        return temp;
    }
}
class MergeSort{
    public static int[] mergeSort(int[] array){
        if(array.length == 1) return array;
        int start = 0;
        int end = array.length;
        int mid = (int) (start + end) / 2;
        int [] left = new int[mid - start];
        int [] right = new int[end - mid];

        for(int i = 0; i < mid; i++){
            left[i] = array[i];
        }
        for(int i = 0; i < end - mid; i++){
            right[i] = array[mid + i];
        }
        return merge(mergeSort(left), mergeSort(right));
    }
    public static int[] merge(int left[], int right[]){
        int l = 0, r = 0, i = 0;
        int [] temp = new int[left.length + right.length];
        while(l<left.length && r < right.length){
            if(left[l] < right[r]){
                temp[i] = left[l++];
            } else {
                temp[i] = right[r++];
            }
            i++;
        }
        if(l<left.length){
            for(;l<left.length;l++,i++)
                temp[i] = left[l];
        } else {
            for(;r<right.length;r++, i++)
                temp[i] = right[r];
        }

        return temp;
    }
}