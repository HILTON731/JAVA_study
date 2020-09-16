package java_study.study200409;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("숫자를 입력하시오: ");
        String num = sc.next();
        System.out.printf("%d개의 글자로 이루어진 문자열입니다.\n", num.length());
        for(int i = 0; i<num.length();i++){
            System.out.printf("%s ",num.charAt(i));
        }
    }
}
