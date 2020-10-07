package dke.algorithm.assignment.sorting;

import java.util.Random;

public class CreateInput {
    public int[] createInput(int size){
        int[] intArray = new int[size];
        Random random = new Random(7777);

        intArray = new int[size];
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = random.nextInt(100000);
        }
        return intArray;
    }
}
