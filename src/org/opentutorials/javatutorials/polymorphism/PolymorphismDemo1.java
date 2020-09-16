package org.opentutorials.javatutorials.polymorphism;
class A{
    public String x(){return "A.x";}
}
class B extends A {
    public String x(){return "B.x";}//
    public String y(){return "y";}
}
class B2 extends A{
    public String x(){return "B2.x";}
}
public class PolymorphismDemo1 {
    public static void main(String[] args) {
        A obj = new B();
        A obj2 = new B2();
        System.out.println(obj.x());//B.x 출력
        System.out.println(obj2.x());//B2.x 출력
        //실질적으로 B를 담고 있지만 A의 행세를 함
        obj.x();
        //obj.y();# 실행 안됨(A의 행세를 하고 있기 때문에)

        //어떤 클래스르 인스턴스화 할때 인스턴스를 담는 변수의 데이터타입은 그 클래스가 되거나 해당 클래스의 부모클래스가 될 수 있다.
        //해당 인스턴스가 부모클래스처럼 동작 할 수 있음
        //Overriding을 할때 어떤 클래스의 메소드를 사용할 지 구분하기 위해
    }
}
