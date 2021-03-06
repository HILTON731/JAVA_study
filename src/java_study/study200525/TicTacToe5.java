package java_study.study200525;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * 교재에 나오는 코드 (176쪽)
 */

public class TicTacToe5 {

    static final int SIZE = 3;
    static char[][] board = new char[SIZE][SIZE];
    static Scanner scan = new Scanner(System.in);
    static char currentMark;
    static int x, y;
    static GameState state;

    public static boolean isInputValid() {
        if (board[x][y] == ' ') {
            board[x][y] = 'X';
            return true;
        }
        return false;
    }

    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println("  " + board[i][0] + "|  " + board[i][1] + "|  " + board[i][2]);
            if (i != 2)
                System.out.println("---|---|---");
        }
    }

    public static boolean boardFull() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ')
                    return false;
            }
        return true;
    }

    public static void computerPlay() {
        currentMark='O';
        int i, j = 0;
        breakOut:
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    break breakOut;
        }
        if (i < 3)
            board[i][j] = currentMark;
    }

    public static void checkGame() {
        int j, count = 0, countA, countB;
        for (int i = 0; i < 3; i++) {
            countA = 0;
            countB = 0;
            for (j = 0; j < 3; j++) {
                if (board[i][j] == currentMark)
                    countA++;
                if (board[j][i] == currentMark)
                    countB++;
            }
            if (board[i][i] == currentMark || board[i][2 - i] == currentMark)
                count++;
            if (countA == 3 || countB == 3 || count == 3) {
                if (currentMark == 'X') state = GameState.CROSS_WON;
                else if (currentMark == 'O') state = GameState.NOUGHT_WON;
                return;
            }
        }
        state = GameState.PLAYING;
    }

//    public static boolean winOrLose(char temp) {
//        int j, count = 0, countA, countB;
//        for (int i = 0; i < 3; i++) {
//            countA = 0;
//            countB = 0;
//            for (j = 0; j < 3; j++) {
//                if (board[i][j] == temp)
//                    countA++;
//                if (board[j][i] == temp)
//                    countB++;
//            }
//            if (board[i][i] == temp || board[i][2 - i] == temp)
//                count++;
//            if (countA == 3 || countB == 3 || count == 3) return true;
//        }
//        return false;
//    }

    public static void initGame() {
        // 바둑판을 초기화한다.
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = ' ';
    }

    public static void humanPlay() {
        currentMark='X';

        System.out.print("다음 수의 좌표를 입력하시오: ");
        x = scan.nextInt();
        y = scan.nextInt();

        if (!isInputValid()) {
            System.out.println("잘못된 위치입니다. ");
        }
    }
    public static void printResult(){
        switch (state) {
            case CROSS_WON:
                System.out.println("당신이 이겼습니다. 축하합니다.");
                break;
            case NOUGHT_WON:
                System.out.println("당신이 졌습니다. 다시 도전하세요.");
                break;
            case DRAW:
                System.out.println("비겼습니다. 막상막하군요.");
                break;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Tic-Tac-Toe 게임입니다.");
        System.out.println("사람이 X, 컴퓨터가 O입니다.");

        // 바둑판을 초기화한다.
        initGame();
        printBoard();
        checkGame();

        boolean end = false;
        String winner = null;

        while (!end) {
            // 사람의 입력을 받는다.
            humanPlay();
            // 바둑판을 화면에 그린다.
            printBoard();
            checkGame();

            if (state != GameState.PLAYING) {
                end = true;
                continue;
            }
            TimeUnit.SECONDS.sleep(1);

            computerPlay();
            printBoard();
            checkGame();
            if (state != GameState.PLAYING) {
                end = true;
            }
        }
        printResult();
        scan.close();
    }
}