package dke.algorithm.assignment.matrixmul;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Execute {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        String createfile = "D:\\IdeaProjects\\Java_study\\mulcount.csv";
        FileWriter fw = new FileWriter(createfile);
        Scanner sc = new Scanner(System.in);
        System.out.print("MaxSize of Array: ");
        int size = sc.nextInt();
        fw.append("SIZE").append(',').append("SIMPLE").append(',').append("STRASSEN").append('\n');
        for (int i = 2; i <= size; i *= 2) {
            System.out.println("Array size: " + i);
            fw.append(Integer.toString(i)).append(',');
            int[][] matrix1 = new CreateMatrix(i, i).createMatrix();
            int[][] matrix2 = new CreateMatrix(i, i).createMatrix();
            System.out.println("SimpleMatrix");
            SimpleMatrix.simpleMatrix(matrix1, matrix2);
            System.out.println("MulCount of SimpleMatrix: " + count);
            fw.append(Integer.toString(count)).append(',');

            count = 0;

            System.out.println("StrassenMatrix");
            StrassenMatrix.strassenMatrix(matrix1.length, matrix1, matrix2);
            System.out.println("MulCount of StrassenMatrix: " + count);
            fw.append(Integer.toString(count)).append('\n');
        }
        fw.flush();
        fw.close();
    }
}
