package dke.algorithm.assignment.sorting;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Execute {
    static int count = 0;
    public static void main(String[] args) throws IOException {
        String createfile = "D:\\IdeaProjects\\Java_study\\sortingtime.csv";
        FileWriter fw = new FileWriter(createfile);
        Scanner sc = new Scanner(System.in);
        System.out.print("Max array size: ");
        int size = sc.nextInt();
        System.out.println();
        fw.append("SIZE").append(',').append("BUBBLE").append(',').append("BUBBLE_TIME").append(',').append("MERGE").append(',').append("MERGE_TIME").append(',').append("QUICK").append(',').append("QUICK_TIME").append('\n');
        for(int i = 10000; i <= size; i+=5000) {
            System.out.println("Array size: "+i);
            fw.append(Integer.toString(i));
            fw.append(',');
            for (int j = 1; j < 4; j++) {
                Execute.count = 0;
                double time = measureTime(j, new CreateInput().createInput(i));
                fw.append(Double.toString(time)).append(',').append(Integer.toString(count)).append(',');
            }
            fw.append('\n');
            System.out.println();
        }
        fw.flush();
        fw.close();
    }
    public static double measureTime(int i, int[] arr){
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
        System.out.println(time+"sec "+count);
        return time;
    }
}
