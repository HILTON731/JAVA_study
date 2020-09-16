package java_study.study200419;

public class P4 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for(int i=0;i<a.length;i++)
            a[i]=i;

        System.out.print("printArray(a, 0): ");
        printArray(a, 0);
        System.out.print("printArray(a, 1): ");
        printArray(a, 1);
        System.out.print("printArray(a, a.length): ");
        printArray(a, a.length);
        System.out.print("printArray(a, a.length+1): ");
        printArray(a, a.length+1);
    }
    public static void printArray(int[] a, int n){
        if(a.length>=n){
            for(int i=0;i<n;i++) {
                System.out.printf("%d ", a[i]);
            }
        }else{
            System.out.println("배열의 크기보다 더 많은 출력을 요구했습니다.");
            System.out.println("배열의 크기만큼만 출력합니다.");
            for(int i=0;i<a.length;i++) {
                System.out.printf("%d ", a[i]);
            }
        }
        System.out.println();
    }
}
