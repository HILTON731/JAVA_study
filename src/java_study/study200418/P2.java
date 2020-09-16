package java_study.study200418;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) throws FileNotFoundException {
        final int SIZE_A = 3;
        final int SIZE_B = 5;

        int[][] a = new int[SIZE_A][SIZE_B];
        int[][] b = new int[SIZE_B][SIZE_A];
        int[][] c = new int[SIZE_A][SIZE_A];
        int sum;
        Scanner sc = new Scanner(new File("metrix1.txt"));
        for(int i = 0; i < SIZE_A; i++){
            for(int j = 0; j < SIZE_B; j++){
                a[i][j]=sc.nextInt();
            }
        }
        sc = new Scanner(new File("metrix2.txt"));
        for(int i = 0; i < SIZE_B; i++){
            for(int j = 0; j < SIZE_A; j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int i = 0; i < SIZE_A;i++){
            for(int j=0;j<SIZE_A;j++){
                sum=0;
                for(int k=0;k<SIZE_B;k++){
                    sum+=a[i][k]*b[k][j];
                }
                c[i][j]=sum;
            }
        }
        System.out.println("A행렬");
        printMetrix(a);
        System.out.println("\nB행렬");
        printMetrix(b);
        System.out.println("\nC행렬");
        printMetrix(c);

        sc.close();
    }
    public static void printMetrix(int[][] a){
        for(int i = 0;i<a.length;i++){
            for(int j = 0; j<a[i].length;j++){
                System.out.printf("%d\t",a[i][j]);
            }
            System.out.println();
        }
    }
}
