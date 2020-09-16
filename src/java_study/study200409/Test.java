package java_study.study200409;
class Cat{
    public void yaong(){
        System.out.println("야옹~");
    }
    public void groom(){
        System.out.println("예쁨~");
    }
    public void sleep(){
        System.out.println("음냐~");
    }
}
public class Test {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        c1.yaong();
        c1.groom();
        c2.yaong();
        c2.groom();
    }
}
