package dke.algorithm.assignment.sorting;

public class MergeSort {
    static CreateInput createInput = new CreateInput();
    public static void main(String[] args) {
        int arraylen = createInput.intArray.length;
        System.out.println("Size: "+arraylen);
        for(int arr : createInput.intArray){
            System.out.print(arr+"\t");
        }
        System.out.println();
        mergeSort(createInput.intArray, 0, arraylen - 1);
        for(int arr : createInput.intArray){
            System.out.print(arr+"\t");
        }

    }

    private static void mergeSort(int[] intArray, int start, int end) {
        if(start < end) {
            int mid = (int) (start + end) / 2;
            mergeSort(intArray, start, mid);
            mergeSort(intArray, mid + 1, end);
            merge(intArray, start, mid, end);
        }
    }

    private static void merge(int[] intArray, int start, int mid, int end) {
        int i = start, j = mid + 1, k = 0;
        int[] temp = new int[end - start + 1];
        while(i <= mid && j <= end){
            if(intArray[i] < intArray[j]){
                temp[k] = intArray[i++];
            } else {
                temp[k] = intArray[j++];
            }
            k++;
        }
        if(i <= mid){
            for(;i<=mid;i++){
                temp[k++] = intArray[i];
            }
        } else if(j <= end){
            for(;j<=end;j++){
                temp[k++] = intArray[j];
            }
        }
        for(int l = start, m = 0; l <= end; l++, m++){
            intArray[l] = temp[m];
        }
    }
}
