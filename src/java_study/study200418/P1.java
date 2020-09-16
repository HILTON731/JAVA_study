package java_study.study200418;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) throws FileNotFoundException {
        final int ROW = 3;
        final int COLUMN = 5;

        int[][] metrix = new int[ROW][COLUMN];
        int[][] metrix_T = new int[COLUMN][ROW];
        Scanner sc = new Scanner(new File("integers15.txt"));
        for(int i = 0;i<ROW;i++){
            for(int j = 0;j<COLUMN;j++){
                int temp = sc.nextInt();
                metrix[i][j] = temp;
                metrix_T[j][i] = temp;
            }
        }
        System.out.println("원래의 행렬");
        printMetrix(metrix);
        System.out.println();
        System.out.println("전치행렬");
        printMetrix((metrix_T));
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
