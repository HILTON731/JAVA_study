package java_study.study200409;

import java.util.Scanner;

public class TurtleDrive7 {
    public static void main(String[] args) {
        Turtle turtle = new Turtle(0.3, 0.3, 0);
        System.out.print("몇 각형을 그릴 것인가?");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double size = sc.nextDouble();
        for (int j = 0; j < 3; j++) {
            drawNgon(turtle, num, size);
        }
    }

    public static void drawNgon(Turtle t, int n, double size) {
        final int PAUSE = 1000;
        final int ANGLE = 120;


        for (int i = 0; i < 3; i++) {
            t.goForward(size);
            t.turnLeft(120);
            t.pause(PAUSE);
        }
        t.turnLeft(ANGLE);

    }
}
