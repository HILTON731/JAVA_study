package dke.algorithm.assignment.minsearch;

import java.util.*;

public class MinSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int size = sc.nextInt();
        int[] temp = getNumber(size);
        System.out.println("Array Created");
        System.out.println(temp);
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
        int[] min = new int[3];

        for (int i = 0; i < temp.length; i++) {

            }
        }


    }
}
