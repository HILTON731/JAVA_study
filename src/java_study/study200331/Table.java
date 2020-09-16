package java_study.study200331;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        for(int i = 0; i<row;i++){
            for(int j=0;j<column;j++){
                System.out.printf("(%d, %d) ",i,j);
            }
            System.out.println();
        }
    }
}
