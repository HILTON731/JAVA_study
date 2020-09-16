package java_study.study200419;

public class P1 {
    public static void main(String[] args) {
        int[] anArray = {10, 20};

        swap(anArray[0], anArray[1]);
        System.out.println("anArray[0]="+anArray[0]+",anArray[1]="+anArray[1]);
        swap(anArray, 0, 1);
        System.out.println("anArray[0]="+anArray[0]+",anArray[1]="+anArray[1]);
    }
    public static void swap(int x, int y){
        int temp;
        temp = x;
        x = y;
        y = temp;
    }
    public static void swap(int[] a, int i, int j){
        int temp;
        temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
