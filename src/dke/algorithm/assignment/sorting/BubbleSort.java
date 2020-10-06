package dke.algorithm.assignment.sorting;

public class BubbleSort {
    static CreateInput createInput = new CreateInput();
    public static void main(String[] args) {
        System.out.println("Size: "+createInput.intArray.length);
        System.out.println("Original array");
        for(int arr : createInput.intArray){
            System.out.print(arr+" ");
        }
        System.out.println();

        long start = System.currentTimeMillis();

        bubbleSort(createInput.intArray);

        long end = System.currentTimeMillis();

        System.out.println("Sorted array");
        for(int arr : createInput.intArray){
            System.out.print(arr+" ");
        }
        System.out.println();
        double time = (end - start) / 1000.0;
        System.out.println("Time of ");
        System.out.println(time);
    }

    private static void bubbleSort(int[] intArray) {
        for(int i = 0; i < intArray.length; i++){
            for(int j = 0; j < intArray.length - i - 1; j++){
                if(intArray[j+1] < intArray[j]){
                    int temp = intArray[j + 1];
                    intArray[j + 1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
    }
}
