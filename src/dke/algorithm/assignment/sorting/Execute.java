package dke.algorithm.assignment.sorting;

import java.util.Scanner;

public class Execute {
    static CreateInput createInput;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int size = sc.nextInt();
        System.out.println();
        for(int i = 1; i < 4; i++){
            measureTime(i, new CreateInput().createInput(size));
        }
    }
    public static void measureTime(int i, int[] arr){
        Sort sort = new Sort();
        long start = 0, end = 0;
        switch(i){
            case 1:
                System.out.print("BubbleSort: ");
                start = System.currentTimeMillis();
                sort.bubbleSort(arr);
                end = System.currentTimeMillis();
                break;
            case 2:
                System.out.print("MergeSort: ");
                start = System.currentTimeMillis();
                sort.mergeSort(arr, 0, arr.length - 1);
                end = System.currentTimeMillis();
                break;
            case 3:
                System.out.print("QuickSort: ");
                start = System.currentTimeMillis();
                sort.quickSort(arr,0, arr.length - 1);
                end = System.currentTimeMillis();
                break;
        }
        double time = (end - start)/1000.0;
        System.out.println(time+" sec");
    }
}
