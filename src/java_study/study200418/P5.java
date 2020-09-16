package java_study.study200418;

public class P5 {
    public static void main(String[] args) {
        int[] array;
        array = makeArray();
        P3.printArray(array,10);
        for(int i=1;i<array.length+1;i++){
            System.out.println();
            P3.printArray(makeArray(i),i);
        }

    }
    public static int[] makeArray(){
        int[] a = new int[10];
        for(int i=0;i<10;i++)
            a[i]=i*i;
        return a;
    }
    public static int[] makeArray(int n){
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=i*i;
        return a;
    }
}
