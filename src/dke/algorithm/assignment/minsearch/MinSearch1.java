package dke.algorithm.assignment.minsearch;

import java.util.*;

public class MinSearch1 {
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

    private static void printBoundary(int[] temp, int bound) {
        int[] min = new int[bound];
        int tmp;

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0;j<bound;j++) {
                if (temp[i] < min[j] || min[j] == 0) {
                    if(j == bound - 1)
                        min[j] = temp[i];
                    tmp = min[j];
                    min[j] = temp[i];
                    min[j+1] = tmp;
                    break;
                }
            }
        }
        for(int value : min)
            System.out.println(value);

    }
}
