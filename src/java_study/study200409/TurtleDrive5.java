package java_study.study200409;

import java.util.Scanner;

public class TurtleDrive5 {
    public static void main(String[] args) {
        Turtle turtle = new Turtle(0.2,0.2,0);
        System.out.printf("몇 각형을 그릴 것인가?");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double size = sc.nextDouble();
        drawNgon(turtle, num, size);

    }
    public static void drawNgon(Turtle t, int n, double size){
        final int PAUSE = 1000;
        final double STEP = size;
        final int ANGLE = 180-180*(n-2)/n;

        for(int i =0;i<n;i++){
            t.goForward(STEP);
            t.turnLeft(ANGLE);
            t.pause(PAUSE);
        }
    }
}
