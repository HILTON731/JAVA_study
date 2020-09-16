package java_study.study200518;

public class P6 {
    private String name;
    private int age;

    public P6() {}
    public P6(String name){
        this.name = name;
    }
    public P6(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int i){
        this.age = i;
    }
    public String toString(){
        return "Human[name=" + name + ",age=" + age + "]";
    }
    public static void main(String[] args){
        P6 c1, c2, c3;

        c1 = new P6();
        c2 = new P6("girl");
        c3 = new P6("man", 19);

        c1.setName("big eye");
        c1.setAge(20);

        c2.setAge(21);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
