package org.opentutorials.javatutorials.progenitor;

class Student implements Cloneable{
    String name;
    Student(String name){
        this.name = name;
    }
    public boolean equals(Object obj){
        Student _obj = (Student)obj;
        return this.name == _obj.name;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    //hashcode가 무엇인지 어떻게 변형해야 하는지 공부!!
}
public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student("egoing");
        //Student s2 = new Student("egoing");
        //System.out.println(s1==s2);
        //System.out.println(s1.equals(s2));
        try {
            Student s2 = (Student)s1.clone();
            System.out.println(s1.name);
            System.out.println(s2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
