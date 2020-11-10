package dke.algorithm.assignment.seqmatmul;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SeqMatMul {
    static int num;

    public static void main(String[] args) {
        int[][] d = creatMatrix();
//        int[][] d = {{5, 0}, {2, 0}, {3, 0}, {4, 0}, {6, 0}, {7, 0}, {8, 0}};
        System.out.println();
        System.out.println(Arrays.deepToString(d));
//        num = 7;
        SeqMatMul seqMatMul = new SeqMatMul();
        System.out.println(seqMatMul.bruteForce(d, num - 1));
        System.out.println(seqMatMul.dynamicProgramming(d,num - 1));
    }

    public static int[][] creatMatrix() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Matrix count num: ");
        num = sc.nextInt() + 1;
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

    public int bruteForce(int[][] d, int count) {
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
            else fin[i] = tmp + bruteForce(d, count - 1);
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
    public int dynamicProgramming(int[][] d, int num){
        int[][] M = new int[num][num];
        int[][] P = new int[num - 1][num];
        int diagonal = 0;
        int i, j, k = 0, temp, tmp = 0;

        for(diagonal = 1; diagonal < num;diagonal++){
            for(i = 0; i < num-diagonal; i++){
                j = i + diagonal;
                temp = 0;
                for(k = i; k < j;k++){
                    if(temp > M[i][k] + M[k+1][j]+d[i][0] * d[k + 1][0] * d[j + 1][0] || temp == 0) {
                        temp = M[i][k] + M[k + 1][j] + d[i][0] * d[k + 1][0] * d[j + 1][0];
                        tmp = k;
                    }
                }
                M[i][j] = temp;
                P[i][j] = tmp + 1;
            }
        }
        System.out.println("M");
        for(int[] cs : M){
            for(int ct: cs)
                System.out.print(ct+"\t");
            System.out.println();
        }
        System.out.println("P");
        for(int[] cs : P){
            System.out.println(Arrays.toString(cs));
        }
        return M[0][num - 1];
    }
}