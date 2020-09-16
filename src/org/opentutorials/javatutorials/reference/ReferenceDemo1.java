package org.opentutorials.javatutorials.reference;
class A{
    public int id;
    A(int id){
        this.id = id;
    }
}
public class ReferenceDemo1 {
    public static void runValue(){
        int a = 1;
        int b = a;
        b = 2;
        System.out.println(("runValue, "+a));
    }

    public static void runReference(){
        A a = new A(1);//a의 데이터타입 A, new를 통해 1을 전달해서 A의 id값에 1이 저장됨
        A b = a;//b의 데이터타입 A, b는 a이다. # int b = a와 유사하지만 결과는 다르다.
        //b는 a의 참조(reference)
        b = new A(2);
        b.id = 2;
        System.out.println("runReference, "+a.id);
    }
    public static void main(String[] args) {
        runValue();
        runReference();
    }
}
