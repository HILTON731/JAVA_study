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
        fw.append("SIZE").append(',').append("SIMPLE").append(',').append("SIMPLE_TIME").append(',').append("STRASSEN").append(',').append("STRASSEN_TIME").append('\n');

        for (int i = 2; i <= size; i *= 2) {

            count = 0;
            System.out.println("Array size: " + i);
            fw.append(Integer.toString(i)).append(',');
            int[][] matrix1 = new CreateMatrix(i, i).createMatrix();
            int[][] matrix2 = new CreateMatrix(i, i).createMatrix();
            System.out.println("SimpleMatrix");
            long start = System.currentTimeMillis();
            SimpleMatrix.simpleMatrix(matrix1, matrix2);
            long end = System.currentTimeMillis();
            double time = (end - start) / 1000.0;
            System.out.println("MulCount of SimpleMatrix: " + count + ", Time of SimpleMatrix: " + time + "sec");
            fw.append(Integer.toString(count)).append(',').append(Double.toString(time)).append(',');

            count = 0;

            System.out.println("StrassenMatrix");
            start = System.currentTimeMillis();
            StrassenMatrix.strassenMatrix(matrix1.length, matrix1, matrix2);
            end = System.currentTimeMillis();
            time = (end - start) / 1000.0;
            System.out.println("MulCount of StrassenMatrix: " + count + ", Time of SimpleMatrix: " + time + "sec");
            fw.append(Integer.toString(count)).append(',').append(Double.toString(time)).append('\n');
        }
        fw.flush();
        fw.close();
    }
}
