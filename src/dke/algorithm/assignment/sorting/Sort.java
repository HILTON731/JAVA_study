package dke.algorithm.assignment.sorting;

public class Sort {
    public int[] bubbleSort(int[] intArray) {
        int length = intArray.length - 1, temp;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length - i; j++){
                if(intArray[j+1] < intArray[j]){
                    temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                    Execute.count++;
                }
            }
        }
        return intArray;
    }

    public void mergeSort(int[] intArray, int start, int end) {
        if(start < end) {
            int mid = (int) (start + end) / 2;
            mergeSort(intArray, start, mid);
            mergeSort(intArray, mid + 1, end);
            merge(intArray, start, mid, end);
        }
    }

    private void merge(int[] intArray, int start, int mid, int end) {
        int i = start, j = mid + 1, k = 0;
        int[] temp = new int[end - start + 1];
        while(i <= mid && j <= end){
            if(intArray[i] < intArray[j]){
                temp[k] = intArray[i++];
            } else {
                temp[k] = intArray[j++];
            }
            k++;
            Execute.count++;
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

    public void quickSort(int[] intArray, int start, int end) {
        if (start < end) {
            int mid = partition(intArray, start, end);

            quickSort(intArray, start, mid - 1);
            quickSort(intArray, mid, end);
        }
    }

    private int partition(int[] intArray, int start, int end) {
        int pivot = intArray[(start + end) / 2];
        while (start <= end) {
            while (intArray[start] < pivot) {
                start++;
                Execute.count++;
            }
            while (intArray[end] > pivot){
                end--;
                Execute.count++;
            }
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
