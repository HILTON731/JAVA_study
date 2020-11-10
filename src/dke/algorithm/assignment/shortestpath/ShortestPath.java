package dke.algorithm.assignment.shortestpath;

import edu.princeton.cs.introcs.In;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShortestPath {
    static int nan = 1000;
    static int[][] W = {
            {0, 1, nan, 1, 5},
            {9, 0, 3, 2, nan},
            {nan, nan, 0, 4, nan},
            {nan, nan, 2, 0, 3},
            {3, nan, nan, nan, 0}
    };
    static int[][] D;
    static int[][] P;
    public static void main(String[] args) {
        ShortestPath shortestPath = new ShortestPath();
        Scanner sc = new Scanner(System.in);
        int num = 5;

//        System.out.print("number of vertex: ");
//        num = sc.nextInt();
//        createPath(num);
        shortestPath.dynamicProgramming(W, num);
        System.out.println("W");
        for(int[] cs: W){
            for(int t: cs){
                System.out.print(t+"\t");
            }
            System.out.println();
        }
        System.out.println("D");
        for(int[] cs: D){
            for(int t: cs){
                System.out.print(t+"\t");
            }
            System.out.println();
        }
        System.out.println("P");
        for(int[] cs: P){
            for(int t: cs){
                System.out.print(t+"\t");
            }
            System.out.println();
        }
//        System.out.println("start, end point");
//        int start = sc.nextInt(), end = sc.nextInt();
//        shortestPath.path(start - 1, end - 1, P);

        W = new int[][]{
                {0, 1, 3, nan, nan},
                {1, 0, 3, 6, nan},
                {3, 3, 0, 4, 2},
                {nan, 6, 4, 0, 5},
                {nan, nan, 2, 5, 0}
        };
        shortestPath.dijkstra(W,num);

    }
    public static int[][] createPath(int size){
        W = new int[size][size];
        Random random = new Random();
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(i!=j) {
                    W[i][j] = (random.nextInt(9) + 1 < 1) ? Integer.MAX_VALUE : random.nextInt(10) + 1;
                } else {
                    W[i][j] = 0;
                }
            }
        }
        return W;
    }
    public void dynamicProgramming(int[][] W, int n){
        D = new int[n][n];
        P = new int[n][n];
        int i, j, k;

        for(i = 0; i < n; i++){
            System.arraycopy(W[i], 0, D[i], 0, n);
        }
        for(int[] cs: D){
            System.out.println(Arrays.toString(cs));
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

        for(i = 1; i < num; i++){
            touch[i] = 0;
            length[i] = W[0][i];
        }
        while(n < num){

            System.out.println("step "+n);
            System.out.println(Arrays.toString(length));
            System.out.println(Arrays.toString(touch));

            min = Integer.MAX_VALUE;
            for(i = 1; i < num; i++){
                if(0 <= length[i] && length[i] < min){
                    min = length[i];
                    vnear = i;
                    System.out.println("sk"+vnear);
                }
            }
            System.out.println("vnear: "+vnear+" min: "+min);
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
