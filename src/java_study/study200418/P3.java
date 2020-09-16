package java_study.study200418;

public class P3 {
    public static void main(String[] args) {
        final int SIZE = 20;
        final int MAX = 10;
        int[] intArray;

        intArray = makeRandomArray(SIZE, MAX);

        System.out.printf("0 이상 %d 미만 정수 난수\n",MAX);
        printArray(intArray, SIZE);
    }
    public static int[] makeRandomArray(int n, int max){
        int[] array = new int[n];
        for(int i = 0; i<n;i++){
            array[i]=(int)(max*Math.random());
        }
        return array;
    }
    public static void printArray(int[] a, int n){
        for(int i = 0;i<n;i++)
            System.out.printf("%d ",a[i]);
    }
}
