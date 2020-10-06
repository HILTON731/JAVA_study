package dke.algorithm.assignment.matrixmul;

import java.util.Scanner;

public class StrassenMatrix {
    private static int[][] matrix1;
    private static int[][] matrix2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        matrix1 = new CreateMatrix(8, 8).createMatrix();
        matrix2 = new CreateMatrix(8, 8).createMatrix();
        System.out.println("matrix1");
        for (int[] arr : matrix1) {
            for (int num : arr) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
        System.out.println("matrix2");
        for (int[] arr : matrix2) {
            for (int num : arr) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
        System.out.println("mulmatrix");
        for (int[] arr : strassenMatrix(matrix1.length, 0, matrix1, matrix2)) {
            for (int num : arr) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] strassenMatrix(int n, int count, int[][] matrix1, int[][] matrix2) {
        if (n < 2) {
            int[][] matrix =SimpleMatrix.simpleMatrix(matrix1, matrix2);
            for (int[] arr : matrix) {
                for (int num : arr) {
                    System.out.print(num + "\t");
                }
                System.out.println();
            }
            return matrix;
        }
        int length = matrix1.length / 2;
        int[][] a11 = subMatrix(matrix1, length, 0, 0);
        int[][] a12 = subMatrix(matrix1, length, 0, length);
        int[][] a21 = subMatrix(matrix1, length, length, 0);
        int[][] a22 = subMatrix(matrix1, length, length, length);
        int[][] b11 = subMatrix(matrix2, length, 0, 0);
        int[][] b12 = subMatrix(matrix2, length, 0, length);
        int[][] b21 = subMatrix(matrix2, length, length, 0);
        int[][] b22 = subMatrix(matrix2, length, length, length);

        int[][] m1 = strassenMatrix(length, count, impMatrix(a11, a22, '+'), impMatrix(b11, b22, '+'));
        int[][] m2 = strassenMatrix(length, count, impMatrix(a21, a22, '+'), b11);
        int[][] m3 = strassenMatrix(length, count, a11, impMatrix(b12, b22, '-'));
        int[][] m4 = strassenMatrix(length, count, a22, impMatrix(b21, b11, '-'));
        int[][] m5 = strassenMatrix(length, count, impMatrix(a11, a12, '+'), b22);
        int[][] m6 = strassenMatrix(length, count, impMatrix(a21, a11, '-'), impMatrix(b11, b12, '+'));
        int[][] m7 = strassenMatrix(length, count, impMatrix(a12, a22, '-'), impMatrix(b21, b22, '+'));

        int[][] c1 = impMatrix(impMatrix(m1, m4, '+'), impMatrix(m5, m7, '-'), '-');
        int[][] c2 = impMatrix(m3, m5, '+');
        int[][] c3 = impMatrix(m2, m4, '+');
        int[][] c4 = impMatrix(impMatrix(m1, m3, '+'), impMatrix(m2, m6, '-'), '-');

        return combine(c1, c2, c3, c4);
    }

    private static int[][] combine(int[][] c1, int[][] c2, int[][] c3, int[][] c4) {
        int length = c1.length;
        int[][] temp = new int[length * 2][length * 2];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                temp[i][j] = c1[i][j];
                temp[i][j + length] = c2[i][j];
                temp[i + length][j] = c3[i][j];
                temp[i + length][j + length] = c4[i][j];
            }
        }
        for (int[] arr : temp) {
            for (int num : arr) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
        return temp;
    }

    private static int[][] impMatrix(int[][] matrix1, int[][] matrix2, char imp) {
        int length = matrix1.length;
        int[][] temp = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                switch (imp) {
                    case '+':
                        temp[i][j] = matrix1[i][j] + matrix2[i][j];
                    case '-':
                        temp[i][j] = matrix1[i][j] - matrix2[i][j];
                }
                System.out.println(imp);
            }
        }
        return temp;
    }

    private static int[][] subMatrix(int[][] matrix, int length, int row, int col) {
        int[][] temp = new int[length][length];
        for (int i = row; i < length + row; i++) {
            for (int j = col; j < length + col; j++) {
                temp[i - row][j - col] = matrix[i][j];
            }
        }
        return temp;
    }

}
