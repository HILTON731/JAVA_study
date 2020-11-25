package dke.algorithm.assignment.mcoloring;

import java.util.Arrays;

public class mColoring {
    static final int m = 3;
    static final int n = 5;
    static final boolean T = true;
    static final boolean F = false;
    static int[] vcolor = new int[n + 1];
    static boolean[][] w = new boolean[][]{
            {F, F, F, F, F, F},
            {F, F, T, F, T, F},
            {F, T, F, T, F, T},
            {F, F, T, F, F, T},
            {F, T, F, F, F, T},
            {F, F, T, T, T, F}
    };

    public static void main(String[] args) {
        mColoring mColoring = new mColoring();
        mColoring.m_coloring(0);
    }
    public void m_coloring(int i){
        int color;

        if(promising(i)){
            if(i==n)
                System.out.println(Arrays.toString(vcolor));
            else
                for(color = 1; color<= m; color++){
                    vcolor[i+1] = color;
                    m_coloring(i+1);
                }
        }
    }

    private boolean promising(int i) {
        int j = 1;
        boolean change = true;
        while(j < i && change){
            if(w[i][j] && vcolor[i] == vcolor[j])
                change = false;
            j++;
        }
        return change;
    }
}
