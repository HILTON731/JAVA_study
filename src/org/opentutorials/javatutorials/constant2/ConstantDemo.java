package org.opentutorials.javatutorials.constant2;

enum Fruit{
    APPLE("red"), PEACH("pink"), BANANA("yellow");//()생성자 호출 및 매게변수 지정
    private String color;
    public String getColor(){
        return this.color;
    }
    Fruit(String color){
        System.out.println("Call Constructor "+this);
        this.color = color;
    }
}
enum Company{
    GOOGLE, APPLE, ORACLE;
}
//class Fruit{
//    public static final Fruit APPLE = new Fruit();
//    public static final Fruit PEACH = new Fruit();
//    public static final Fruit BANANA = new Fruit();
//
//    //int APPLE = 1, PEACH = 2, BANANA = 3;
//}
//class Company{
//    public static final Company GOOGLE = new Company();
//    public static final Company APPLE = new Company();
//    public static final Company ORACLE = new Company();
//    //int GOOGLE = 1, APPLE = 2, ORACLE = 3;
//}
public class ConstantDemo {
//    public final static int Fruit_APPLE = 1;
//    public final static int Fruit_PEACH = 2;
//    public final static int Fruit_BANANA = 3;
//    
//    private final static int Company_GOOGLE = 1;
//    private final static int Company_APPLE = 2;// final 지정시 값 변경이 불가능하기 때문
//    private final static int CompanyORACLE = 3;
    public static void main(String[] args) {
        
//        if(Fruit.APPLE == Company.APPLE){
//            System.out.println("과일 APPLE과 기업 APPLE은 같습니다.");
//        }
//        Fruit type = Fruit.APPLE;
//        switch(type){
//            case APPLE:
//                System.out.println(57+" kcal, color: "+Fruit.APPLE.getColor());;
//                break;
//            case PEACH:
//                System.out.println(34+" kcal, color: "+Fruit.PEACH.getColor());
//                break;
//            case BANANA:
//                System.out.println(93+" kcal, color: "+Fruit.BANANA.getColor());
//                break;
//        }
        for(Fruit f : Fruit.values()){
            System.out.println(f+" "+f.getColor());
        }
    }
}
