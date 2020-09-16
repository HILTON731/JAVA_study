package java_study.study200419;

import com.sun.deploy.util.ArrayUtil;

import static java_study.study200419.P4.printArray;

public class P5 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 5};

        System.out.println("linearSearch test----------");

        System.out.print("배열 a: ");
        printArray(a, a.length);

        System.out.println("linearSearch(a, a.length, 5): "
        +linearSearch(a,a.length,5));
        System.out.println("linearSearch(a, 1, 1): "
                +linearSearch(a,1,1));
        System.out.println("linearSearch(a, 4, 5): "
                +linearSearch(a,4,5));
        System.out.println("linearSearch(a, 1, 2): "
                +linearSearch(a,1,2));
        System.out.println("linearSearch(a, a.length, 2): "
                +linearSearch(a,a.length,2));
        System.out.println("linearSearch(a, 0, 5): "
                +linearSearch(a,0,5));
        System.out.println("linearSearch(a, a.length, 4): "
                +linearSearch(a,a.length,4));
    }
    public static int linearSearch(int[] x, int n, int key){
        for(int i=0;i<n;i++){
            if(key==x[i]) return i;
        }
        return -1;
    }
}
