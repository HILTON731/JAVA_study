package JAVA_book.chap9.LocalClass;

public class A {
    A(){
        System.out.println("A object created");
    }

    class B{
        B(){
            System.out.println("B object created");
        }
        int field1;
        void method1(){}
    }
    static class C{
        C(){
            System.out.println("C object created");
        }
        int field1;
        static int field2;
        void method1(){}
        static void method2(){}
    }

    void method(){
        class D{
            D(){
                System.out.println("D objcet created");
            }
            int field1;
            void method1(){}
        }
        D d = new D();
        d.field1 = 3;
        d.method1();
    }
}
