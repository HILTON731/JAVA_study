package java_study.study200409;

public class TurtleDrive3 {
    public static void main(String[] args) {
        final double STEP = 0.1;	// 이동 거리
        final int ANGLE = 90;		// 회전 각도
        final int PAUSE = 100;		// 일시 정지 시간. milisecond 단위

        Turtle turtle = new Turtle(0.2,0.2,0);
        int i = 0;
        int count = 0;
        while(true) {
            if(i%5==0) {
                for (int j = 0; j < 4; j++) {
                    turtle.pause(PAUSE);
                    turtle.goForward(STEP);
                    turtle.turnLeft(ANGLE);
                }
            }
            turtle.pause(PAUSE);
            turtle.goForward(STEP);
            count++;
            if(count>3)break;
        }
    }
}
