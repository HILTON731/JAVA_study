package org.opentutorials.javatutorials.method;

public class MethodDemo1 {
    public static void numbering() {//메소드 정의
        int i = 0;
        while(i<10){
            System.out.println(i);
            i++;
        }
    }
    public static void main(String[] args) {
        numbering();//메소드 호출
    }
}
