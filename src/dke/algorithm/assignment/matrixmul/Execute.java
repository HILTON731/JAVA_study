package dke.algorithm.assignment.matrixmul;

import java.util.Scanner;

public class Execute {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("MaxSize of Array: ");
        int size = sc.nextInt();
        for(int i = 2; i <= size; i+=2){
                System.out.println("Array size: "+i);
                int[][] matrix1 = new CreateMatrix(i, i).createMatrix();
                int[][] matrix2 = new CreateMatrix(i, i).createMatrix();
//        System.out.println("matrix1");
//        for(int[] arr : matrix1){
//            for(int num : arr){
//                System.out.print(num+"\t");
//            }
//            System.out.println();
//        }
//        System.out.println("matrix2");
//        for(int[] arr : matrix2){
//            for(int num : arr){
//                System.out.print(num+"\t");
//            }
//            System.out.println();
//        }
                System.out.println("SimpleMatrix");
                SimpleMatrix.simpleMatrix(matrix1, matrix2);
//        for(int[] arr : SimpleMatrix.simpleMatrix(matrix1, matrix2)){
//            for(int num : arr){
//                System.out.print(num+"\t");
//            }
//            System.out.println();
//        }
                System.out.println("MulCount of SimpleMatrix: " + count);

                count = 0;

                System.out.println("StrassenMatrix");
                StrassenMatrix.strassenMatrix(matrix1.length, matrix1, matrix2);
                System.out.println("MulCount of StrassenMatrix: " + count);

//        for(int[] arr : StrassenMatrix.strassenMatrix(matrix1.length ,matrix1, matrix2)){
//            for(int num : arr){
//                System.out.print(num+"\t");
//            }
//            System.out.println();
//        }
            }
        }
}
