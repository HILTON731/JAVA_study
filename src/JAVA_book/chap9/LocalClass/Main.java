package JAVA_book.chap9.LocalClass;

public class Main {
    public static void main(String[] args) {
        A a = new A();

        //instance member class object create
        A.B b = a.new B();
        b.field1 = 3;
        b.method1();

        //static member class object create
        A.C c = new A.C();
        c.field1 = 3;
        c.method1();
        A.C.field2 = 3;
        A.C.method2();

        //local class object create
        a.method();
    }
}
