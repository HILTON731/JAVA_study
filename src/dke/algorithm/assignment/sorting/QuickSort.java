package dke.algorithm.assignment.sorting;

public class QuickSort {
    static CreateInput createInput = new CreateInput();

    public static void main(String[] args) {
        int arraylen = createInput.intArray.length;
        System.out.println("Size: " + arraylen);
        for (int arr : createInput.intArray) {
            System.out.print(arr + "\t");
        }
        System.out.println();
        quickSort(createInput.intArray, 0, arraylen - 1);
        for (int arr : createInput.intArray) {
            System.out.print(arr + "\t");
        }
    }

    private static void quickSort(int[] intArray, int start, int end) {
        if (start < end) {
            int mid = partition(intArray, start, end);

            quickSort(intArray, start, mid - 1);
            quickSort(intArray, mid, end);
        }
    }

    private static int partition(int[] intArray, int start, int end) {
        int pivot = intArray[(start + end) / 2];
        while (start <= end) {
            while (intArray[start] < pivot) start++;
            while (intArray[end] > pivot) end--;
            if (start <= end) {
                int temp = intArray[start];
                intArray[start] = intArray[end];
                intArray[end] = temp;
                start++;
                end--;
            }
        }
        return start;
    }
}