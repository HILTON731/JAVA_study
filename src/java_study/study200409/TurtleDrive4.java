package java_study.study200409;

public class TurtleDrive4 {
    public static void main(String[] args) {

        final double STEP = 0.2;

        Turtle turtle = new Turtle(0.1, 0.4, 0);

        for(int k =0; k<4;k++){
            drawSquare(turtle);
        }
    }
    public static void drawSquare(Turtle turtle){

        final double STEP = 0.2;
        final int ANGLE = 90;
        final int PAUSE = 1000;
        turtle.goForward(STEP);
        turtle.turnLeft(ANGLE);
        turtle.pause(PAUSE);
    }
}
