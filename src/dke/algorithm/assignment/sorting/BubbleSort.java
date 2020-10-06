package dke.algorithm.assignment.sorting;

public class BubbleSort {
    static CreateInput createInput = new CreateInput();
    public static void main(String[] args) {
        System.out.println("Size: "+createInput.intArray.length);
        bubbleSort(createInput.intArray);
        for(int arr : createInput.intArray){
            System.out.print(arr+" ");
        }
    }

    private static int[] bubbleSort(int[] intArray) {
        int length = intArray.length - 1, temp;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length - i; j++){
                if(intArray[j+1] < intArray[j]){
                    temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
            }
        }
        return intArray;
    }
}
