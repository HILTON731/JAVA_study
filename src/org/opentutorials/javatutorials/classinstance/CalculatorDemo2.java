package org.opentutorials.javatutorials.classinstance;

import sun.util.calendar.CalendarUtils;

class Calculator2 {
    static double PI = 3.14;
    static int base = 0;
    int left, right;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right)/2);
    }
}
public class CalculatorDemo2 {

    public static void main(String[] args) {

        Calculator2 c1 = new Calculator2();
        c1.setOprands(10, 20);
        c1.sum();

        Calculator2 c2 = new Calculator2();
        c2.setOprands(20, 40);
        c2.sum();

        Calculator2.base = 10;

        c1.sum();

        c2.sum();
    }
}