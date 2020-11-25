package dke.algorithm.assignment.nqueens;

import java.util.Arrays;

public class nQueens {
    static final int n = 5;
    static int[] col = new int[n + 1];
    public static void main(String[] args) {

        nQueens nQueens = new nQueens();
        nQueens.queens(0);

    }
    public void queens(int i){
        int j;
        if(promising(i)){

            if(i == n)
                System.out.println(Arrays.toString(col));
            else
                for(j = 1; j<= n; j++){
                    col[i+1] = j;
                    queens(i+1);
                }
        }
    }

    boolean promising(int i){
        int k = 1;
        boolean change = true;
        while(k < i && change){
            if(col[i] == col[k] || Math.abs(col[i] - col[k]) == Math.abs(i - k))
                change = false;
            k++;
        }
        return change;
    }
}
