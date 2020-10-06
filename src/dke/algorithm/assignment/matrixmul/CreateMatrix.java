package dke.algorithm.assignment.matrixmul;

import java.util.Random;

public class CreateMatrix {
    int row;
    int col;

    public CreateMatrix(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int[][] createMatrix(){
        Random random = new Random(7777);
        int[][] matrix = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
//                matrix[i][j] = random.nextInt(10);
                matrix[i][j] = 1;
            }
        }
        return matrix;
    }
}
