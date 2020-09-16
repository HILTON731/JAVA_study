package java_study.study200401;

import org.opentutorials.javatutorials.io.Scanner2Demo;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        System.out.println("사칙 연산을 하는 프로그램입니다.");
        System.out.println("두 수를 차례로 입력하시오: ");
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble(), B=sc.nextDouble();
        System.out.println("두 수에 어떤 연산을 하시겠습니까?");
        System.out.print("+-*/중 하나를 입력하시오: ");
        String operator = sc.next();
        double result = 0.0;
        switch(operator){
            case "+":
                result = A+B;
                break;
            case "-":
                result = A-B;
                break;
            case "*":
                result = A*B;
                break;
            case "/":
                result = A/B;
                break;
            default:
                System.out.println("지원하지 않는 연산입니다.");
                System.exit(-1);
        }
        System.out.printf("%f %s %f = %f",A,operator,B,result);
    }
}
