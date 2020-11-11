package dke.algorithm.assignment.shortestpath;

import edu.princeton.cs.introcs.In;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShortestPath {
    static int nan = 1000;
    static int[][] W;
    static int[][] D;
    static int[][] P;
    static int[] F;
    public static void main(String[] args) throws IOException {
        ShortestPath shortestPath = new ShortestPath();
        Scanner sc = new Scanner(System.in);
        int num;
        long start, end;
        double t1, t2;
        String createfile = "D:\\IdeaProjects\\Java_study\\shortestpath.csv";
        FileWriter fw = new FileWriter(createfile);
        fw.append("SIZE").append(',').append("DP_TIME").append(',').append("dijkstra_TIME").append('\n');

        System.out.print("number of vertex: ");
        num = sc.nextInt();
        for(int i = 3; i <= num; i++) {
            createPath(i);
            start = System.nanoTime();
            shortestPath.dynamicProgramming(W, i);
            end = System.nanoTime();
            System.out.println("DP result: " + Arrays.toString(D[0]) + " DP Time: " + (t1 = (end - start) / 1000000000.0));
            start = System.nanoTime();
            shortestPath.dijkstra(W, i);
            end = System.nanoTime();
            System.out.println("dijkstra result: " + Arrays.toString(F) + " dijkstra Time: " + (t2 = (end - start) / 1000000000.0));
            fw.append(Integer.toString(i)).append(',').append(Double.toString(t1)).append(',').append(Double.toString(t2)).append('\n');
        }
        fw.flush();
        fw.close();
    }
    public static void createPath(int size){
        W = new int[size][size];
        Random random = new Random();
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(i<j){
                    W[i][j] = W[j][i] = (random.nextInt(9) + 1 < 3) ? nan : random.nextInt(9) + 1;
                }
            }
        }
    }
    public void dynamicProgramming(int[][] W, int n){
        D = new int[n][n];
        P = new int[n][n];
        int i, j, k;
        for(i = 0; i < n; i++){
            System.arraycopy(W[i], 0, D[i], 0, n);
        }
        for(k = 0; k < n; k++){
            for(i = 0; i < n; i++){
                for(j = 0; j < n; j++){
                    if((D[i][k] + D[k][j]) < D[i][j]){
                        P[i][j] = k + 1;
                        D[i][j] = D[i][k] + D[k][j];
                    }
                }
            }
        }
    }
    public void path(int start, int end, int[][] P){
        if(P[start][end]!=0){
            path(start, P[start][end] - 1, P);
            System.out.println(" v"+(P[start][end]));
            path(P[start][end] - 1, end, P);
        }
    }

    public void dijkstra(int[][] W, int num){
        int i, vnear = 0;
        int min, n = 0;
        int[] touch = new int[num];
        int[] length = new int[num];
        F = new int[num];

        for(i = 1; i < num; i++){
            touch[i] = 0;
            length[i] = W[0][i];
        }
        while(n < num - 1){
            min = Integer.MAX_VALUE;
            for(i = 1; i < num; i++){
                if(0 <= length[i] && length[i] < min){
                    min = length[i];
                    vnear = i;
                }
            }
            F[vnear] = length[vnear];
            for(i = 1; i < num; i++){
                if(length[vnear] + W[vnear][i] < length[i]){
                    length[i] = length[vnear] + W[vnear][i];
                    touch[i] = vnear;
                }
            }
            length[vnear] = -1;
            n++;
        }
    }
}
