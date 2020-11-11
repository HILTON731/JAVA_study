package dke.algorithm.assignment.seqmatmul;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SeqMatMul {

    public static void main(String[] args) throws IOException {
        int[][] d;
        long start, end;
        double BF, DP;
        SeqMatMul seqMatMul = new SeqMatMul();
        Scanner sc = new Scanner(System.in);
        System.out.print("Matrix count num: ");
        int num = sc.nextInt();
        String createfile = "D:\\IdeaProjects\\Java_study\\seqmatmul.csv";
        FileWriter fw = new FileWriter(createfile);
        fw.append("SIZE").append(',').append("BF_TIME").append(',').append("DP_TIME").append('\n');


        for (int i = 3; i <= num; i++) {
            d = creatMatrix(i + 1);
            System.out.println();
            System.out.println(Arrays.deepToString(d));

            System.out.print("bruteForce result: ");
            start = System.nanoTime();
            System.out.println(seqMatMul.bruteForce(d, i, num));
            end = System.nanoTime();
            System.out.println("bruteForce time: " + (BF = (end - start) / 1000000000.0));

            System.out.print("dP result: ");
            start = System.nanoTime();
            System.out.println(seqMatMul.dynamicProgramming(d, i));
            end = System.nanoTime();
            System.out.println("dP time: " + (DP = (end - start) / 1000000000.0));
            fw.append(Integer.toString(i)).append(',').append(Double.toString(BF)).append(',').append(Double.toString(DP)).append('\n');
        }
        fw.flush();
        fw.close();
    }

    public static int[][] creatMatrix(int num) {
        Random rand = new Random(777);
        int[][] d = new int[num][2];
        for (int i = 0; i < num; i++) {
            d[i][0] = rand.nextInt(10) + 1;
            d[i][1] = 0;
        }
        return d;
    }


    public static boolean countZero(int[][] d, int offset) {
        int count = 0;
        for (int i = offset; i < d.length; i++) {
            if (d[i][1] == 0) count++;
        }
        return count > 2;
    }

    public int bruteForce(int[][] d, int count, int num) {
        int[] fin = new int[count - 1];
        int tmp, temp = 0;
        for (int i = 0; i < count - 1 && countZero(d, i); i++) {
            tmp = 1;
            for (int j = 0, c = 0; i + j < num && c < 3; j++) {
                if (d[i + j][1] == 0) {
                    tmp *= d[i + j][0];
                    if (c == 1) {
                        temp = i + j;
                        d[temp][1] = 1;
                    }
                    c++;
                }
            }
            if (count < 3) fin[i] = tmp;
            else fin[i] = tmp + bruteForce(d, count - 1, num);
            d[temp][1] = 0;
        }
        if (fin.length == 1) return fin[0];
        else {
            tmp = fin[0];
            for (int i = 1; i < fin.length; i++) {
                if (tmp > fin[i] && fin[i] != 0) tmp = fin[i];
            }
            return tmp;
        }
    }

    public int dynamicProgramming(int[][] d, int num) {
        int[][] M = new int[num][num];
        int[][] P = new int[num - 1][num];
        int diagonal;
        int i, j, k, temp, tmp = 0;

        for (diagonal = 1; diagonal < num; diagonal++) {
            for (i = 0; i < num - diagonal; i++) {
                j = i + diagonal;
                temp = Integer.MAX_VALUE;
                for (k = i; k < j; k++) {
                    if (temp > M[i][k] + M[k + 1][j] + d[i][0] * d[k + 1][0] * d[j + 1][0]) {
                        temp = M[i][k] + M[k + 1][j] + d[i][0] * d[k + 1][0] * d[j + 1][0];
                        tmp = k;
                    }
                }
                M[i][j] = temp;
                P[i][j] = tmp + 1;
            }
        }
        return M[0][num - 1];
    }
}