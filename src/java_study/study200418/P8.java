package java_study.study200418;

public class P8 {
    public static void main(String[] args) {
        int[] a = new int[10];
        writeRandomNumbers(a,a.length);
        System.out.println();
        System.out.println("원소들 중 최소값: "+min(a));
        System.out.println("원소들 중 최대값: "+max(a));
        System.out.println("원소들의 평균 값: "+average(a));
    }
    public static void writeRandomNumbers(int[] a, int n){
        for(int i=0;i<n;i++) {
            a[i] = (int) (100 * Math.random());
            System.out.println(a[i]);
        }
    }
    public static int min(int[] a){
        int temp=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<temp)
                temp = a[i];
        }
        return temp;
    }
    public static int max(int[] a){
        int temp=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>temp)
                temp = a[i];
        }
        return temp;
    }
    public static double average(int[] a){
        int i,sum = 0;
        for(i=0;i<a.length;i++){
            sum += a[i];
        }
        return (double)sum/i;
    }
}
