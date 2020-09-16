package java_study.study200418;

public class P4 {
    public static void main(String[] args) {
        int[] array;
        array = makeArray();
        P3.printArray(array,10);

    }
    public static int[] makeArray(){
        int[] a = new int[10];
        for(int i=0;i<10;i++)
            a[i]=i*i;
        return a;
    }
}
