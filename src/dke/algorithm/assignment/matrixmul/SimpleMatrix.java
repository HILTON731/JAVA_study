package dke.algorithm.assignment.matrixmul;

import java.util.Scanner;

public class SimpleMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix1 = new CreateMatrix(64, 64).createMatrix();
        int[][] matrix2 = new CreateMatrix(64, 64).createMatrix();
        System.out.println("matrix1");
        for(int[] arr : matrix1){
            for(int num : arr){
                System.out.print(num+"\t");
            }
            System.out.println();
        }
        System.out.println("matrix2");
        for(int[] arr : matrix2){
            for(int num : arr){
                System.out.print(num+"\t");
            }
            System.out.println();
        }
        System.out.println("mulmatrix");
        for(int[] arr : simpleMatrix(matrix1, matrix2)){
            for(int num : arr){
                System.out.print(num+"\t");
            }
            System.out.println();
        }
    }
    public static int[][] simpleMatrix(int[][] matrix1, int[][] matrix2){
        int[][] matrix3 = new int[matrix1.length][matrix2[0].length];
        int count = 0;

        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix2[0].length; j++){
                matrix3[i][j] = 0;
                for(int k = 0; k < matrix1[0].length; k++){
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                    count++;
                }
            }
        }
//        System.out.println("count: "+count);
        return matrix3;
    }
}
