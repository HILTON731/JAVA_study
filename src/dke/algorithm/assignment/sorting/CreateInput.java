package dke.algorithm.assignment.sorting;

import java.util.Random;
import java.util.Scanner;

public class CreateInput {
    int[] intArray;

    public CreateInput(){
        Random random = new Random(7777);
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Array");
        intArray = new int[sc.nextInt()];
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = random.nextInt(100);
        }
    }
}
