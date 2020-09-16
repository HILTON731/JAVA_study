package org.opentutorials.javatutorials.generic;
class StudentInfo{
    public int grade;
    StudentInfo(int grade){
        this.grade = grade;
    }
}
//class StudentPerson{
//    public StudentInfo info;
//    StudentPerson(StudentInfo info){
//        this.info = info;
//    }
//}
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){
        this.rank = rank;
    }
}
//class EmployeePerson{
//    public EmployeeInfo info;
//    EmployeePerson(EmployeeInfo info){
//        this.info = info;
//    }
//}
//class Person{
//    public Object info;
//    Person(Object info){
//        this.info = info;
//    }
//}
class Person<T, S>{//<>안에는 기본형데이터타입은 올 수 없다.
    public T info;
    public S id;
    Person(T info, S id){
        this.info = info;
        this.id = id;
    }
}
public class GenericDemo{
    public static void main(String[] args) {
//        StudentInfo si = new StudentInfo(2);
//        StudentPerson sp = new StudentPerson(si);
//        System.out.println(sp.info.grade);
//        EmployeeInfo ei = new EmployeeInfo(1);
//        EmployeePerson ep = new EmployeePerson(ei);
//        System.out.println(ep.info.rank);
//        Person p1 = new Person("부장");
//        EmployeeInfo ei = (EmployeeInfo)p1.info;
//        System.out.println(ei.rank);//type saftey!!
        Integer id = new Integer(1);
        Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(new EmployeeInfo(1),1);
        System.out.println(p1.id.intValue());//Wrapper class에서 Integer라고 하는 메소드 중 intValue를 호출하면 원래의 숫자를 원시데이터타입으로 돌려줌줌
   }
}