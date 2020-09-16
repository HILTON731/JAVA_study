package java_study.study200418;

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, column, max;
        System.out.printf("행의 수: %d",row=sc.nextInt());
        System.out.printf("열의 수: %d",column=sc.nextInt());
        System.out.printf("난수의 최대값: %d",max=sc.nextInt());
        int[][] array = new int[row][column];
        int[][] carray = new int[row+1][column+1];
        System.out.println("초기 배열");
        display(array);
        System.out.println("난수가 저장된 배열");
        random(array,max);
        display(array);
        System.out.println("가로, 세로 합이 계산된 배열");
        calculateSums(array,carray);
        display(carray);
    }
    public static void display(int[][] a){
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
                System.out.printf("%d\t",a[i][j]);
            System.out.println();
        }
    }
    public static void random(int[][] array,int max){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j] = (int)(max*Math.random());
            }
        }
    }
    public static void calculateSums(int[][] array, int[][] carray){
        int sum_row, sum_col;
        for(int i=0;i<array.length;i++){
            sum_row=0;
            for(int j=0;j<array[i].length;j++){
                carray[i][j]=array[i][j];
                sum_row+=array[i][j];
            }
            carray[i][carray[i].length-1]=sum_row;
        }
        for(int i=0;i<array[0].length;i++){
            sum_col=0;
            for(int j=0;j<array.length;j++){
                sum_col+=array[j][i];
            }
            carray[carray.length-1][i]=sum_col;
        }
        sum_row=0;sum_col=0;
        for(int i=0;i<carray.length;i++){
            sum_row+=carray[i][carray[i].length-1];
        }
        for(int i=0;i<carray[0].length;i++){
            sum_col+=carray[carray.length-1][i];
        }
        if(sum_row==sum_col)
            carray[carray.length-1][carray[0].length-1]=sum_row;
    }
}
