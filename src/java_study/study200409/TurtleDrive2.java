package java_study.study200409;

public class TurtleDrive2 {
    public static void main(String[] args) {
        final double STEP = 0.3;	// 이동 거리
        final int ANGLE = 72;		// 회전 각도
        final int PAUSE = 100;		// 일시 정지 시간. milisecond 단위

        Turtle turtle  = new Turtle(0.3, 0.3, 0);	// (x, y, theta)

        for(int i = 0; i<5;i++) {
            turtle.pause(PAUSE);
            turtle.goForward(STEP);
            turtle.turnLeft(ANGLE);
        }
    }
}
