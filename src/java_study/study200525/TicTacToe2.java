package java_study.study200525;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * 교재에 나오는 코드 (176쪽)
 */

public class TicTacToe2 {
    public static boolean isInputValid(char[][] board, int x, int y){
        if (board[x][y] == ' ') {
            board[x][y] = 'X';
            return true;
        }
        return false;
    }
    public static void printBoard(char[][] board){
        for (int i = 0; i < 3; i++) {
            System.out.println("  " + board[i][0] + "|  " + board[i][1] + "|  " + board[i][2]);
            if (i != 2)
                System.out.println("---|---|---");
        }
    }
    public static boolean humanWon(char[][] board){
        int j,count = 0,countA,countB;
        char temp = 'X';
        for (int i = 0; i < 3;i++){
            countA = 0;
            countB = 0;
            for (j = 0; j<3; j++){
                if(board[i][j]==temp)
                    countA++;
                if(board[j][i]==temp)
                    countB++;
            }
            if(board[i][i]==temp||board[i][2-i]==temp)
                count++;
            if(countA==3||countB==3||count==3)return true;
        }
        return false;
    }
    public static boolean boardFull(char[][] board){
        for (int i = 0;i<3;i++)
            for(int j = 0;j<3;j++){
                if(board[i][j]==' ')
                    return false;
            }
        return true;
    }
    public static void computerPlay(char[][] board){
        int i , j=0;
        breakOut:
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    break breakOut;
        }
        if (i < 3)
            board[i][j] = 'O';
    }
    public static boolean computerWon(char[][] board){
        int j,count = 0,countA,countB;
        char temp = 'O';
        for (int i = 0; i < 3;i++){
            countA = 0;
            countB = 0;
            for (j = 0; j<3; j++){
                if(board[i][j]==temp)
                    countA++;
                if(board[j][i]==temp)
                    countB++;
            }
            if(board[i][i]==temp||board[i][2-i]==temp)
                count++;
            if(countA==3||countB==3||count==3)return true;
        }
        return false;
    }
    public static void main(String[] args) throws InterruptedException {

        char[][] board = new char[3][3];
        int x, y;

        Scanner scan = new Scanner(System.in);

        System.out.println("Tic-Tac-Toe 게임입니다.");
        System.out.println("사람이 X, 컴퓨터가 O입니다.");

        // 바둑판을 초기화한다.
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = ' ';

        boolean end = false;
        String winner = null;

        while(!end){
            // 바둑판을 화면에 그린다.
            printBoard(board);

            // 사람의 입력을 받는다.
            System.out.print("다음 수의 좌표를 입력하시오: ");
            x = scan.nextInt();
            y = scan.nextInt();

            if (!isInputValid(board,x,y)) {
                System.out.println("잘못된 위치입니다. ");
                continue;
            }
            printBoard(board);
            if(humanWon(board)){
                end = true;
                winner = "Human";
                continue;
            }
            TimeUnit.SECONDS.sleep(1);
            computerPlay(board);
            if(computerWon(board)){
                end = true;
                winner = "Computer";
                continue;
            }
            if(boardFull(board)){
                end = true;
                winner = "Nobody";
            }
        }
        switch (winner) {
            case "Human":
                System.out.println("당신이 이겼습니다. 축하합니다.");
                break;
            case "Computer":
                System.out.println("당신이 졌습니다. 다시 도전하세요.");
                break;
            case "Nobody":
                System.out.println("비겼습니다. 막상막하군요.");
                break;
        }

        scan.close();

    }
}