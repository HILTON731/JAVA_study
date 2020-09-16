package java_study.study200409;

import java.util.Scanner;

public class TurtleDrive8 {
    public static void main(String[] args) {
        Turtle turtle = new Turtle(0.5, 0.5, 0);
        System.out.print("몇 각형을 그릴 것인가?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double size = sc.nextDouble();
        System.out.printf("몇 개를 그릴 것인가?");
        int num = sc.nextInt();
        for (int j = 0; j < num; j++) {
            drawNgon(turtle, n, size,num);
        }
    }

    public static void drawNgon(Turtle t, int n, double size, int num) {
        final int PAUSE = 1000;
        final int ANGLE = 180-(180*(n-2)/n);
        final int ANGLE_ = 180-(180*(num-2)/num);


        for (int i = 0; i < n; i++) {
            t.goForward(size);
            t.turnLeft(ANGLE);
            t.pause(PAUSE);
        }
        t.turnLeft(ANGLE_);

    }
}
