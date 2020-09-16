package org.opentutorials.javatutorials.polymorphism;
abstract class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    int _sum(){
        return this.left + this.right;
    }
    int _avg(){
        return (this.left + this.right)/2;
    }
    public abstract void sum();
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }
}
class CalculatorDecoPlus extends Calculator{
    public void sum(){
        System.out.println("++" + _sum());
    }
    public void avg(){
        System.out.println("++" + _avg());
    }
}
class CalculatorDecoMinus extends Calculator{
    public void sum(){
        System.out.println("--" + _sum());
    }
    public void avg(){
        System.out.println("--" + _avg());
    }
}

public class CalculatorDemo {
/*
    public static void main(String[] args) {
        Calculator c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);
        c1.run();

        Calculator c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);
        c2.run();
    }
    */
    public static void execute(Calculator cal){
        System.out.println("실행결과");
        cal.run();
    }

    public static void main(String[] args) {
        Calculator c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);

        Calculator c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);

        execute(c1);
        execute(c2);
    }
}
