package org.opentutorials.javatutorials.exception;
import java.io.*;

class DivideException extends ArithmeticException {
    public int left;
    public int right;
    DivideException(){
        super();
    }
    DivideException(String message){
        super(message);
    }
    DivideException(String message, int left, int right){
        super(message);
        this.left = left;
        this.right = right;
    }
}
class Calculator{
    int left, right;
    public void setOprands(int left, int right){//IlleagalArgumentException
        this.left = left;
        this.right = right;
    }
    public void divide() {//ArithmeticException
        //계산결과는 오류가 발생했습니다: / by zero
        if(right == 0){
            throw new DivideException("0으로 나눌 수 없습니다.", this.left, this.right);
        }
        try {
            System.out.println("계산결과는 ");
            System.out.println(this.left / this.right);
            System.out.println("입니다.");
        } catch (Exception e) {
            //System.out.println("오류가 발생했습니다: " + e.getMessage());
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
//            계산결과는
//
//
//            e.getMessage()
//                    / by zero
//
//
//            e.toString()
//            java.lang.ArithmeticException: / by zero
//
//
//            e.printStackTrace()
//            java.lang.ArithmeticException: / by zero
//            at org.opentutorials.javatutorials.exception.Calculator.divide(CalculatorDemo.java:12)
//            at org.opentutorials.javatutorials.exception.CalculatorDemo.main(CalculatorDemo.java:27)

        }
        System.out.println("Divide End");
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        try {
            c1.divide();
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
