package dke.algorithm.assignment.matrixmul;

public class SimpleMatrix {
    public static int[][] simpleMatrix(int[][] matrix1, int[][] matrix2){
        int[][] matrix3 = new int[matrix1.length][matrix2[0].length];

        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix2[0].length; j++){
                matrix3[i][j] = 0;
                for(int k = 0; k < matrix1[0].length; k++){
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                    Execute.count++;
                }
            }
        }
        return matrix3;
    }
}
