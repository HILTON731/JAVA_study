package java_study.study200518;

public class P2 {
    private String name;
    private int age;

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

         P2 human1 = new P2();
         P2 human2 = new P2();

         human1.setName("girl");
         human1.setAge(19);

         human2.setName("man");
         human2.setAge(20);

        System.out.println(human1);
        System.out.println(human2);

    }
}
