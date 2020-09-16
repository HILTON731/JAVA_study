package java_study.study200409;

public class StringTest {
    public static void main(String[] args) {
        String p = "A barking dog";
        String s1, s2, s3, s4;

        System.out.println("문자열의 길이 = " + p.length());

        s1 = p.concat("never Bites!");
        s2 = p.replace('B','b');
        s3 = p.substring(2,5);
        s4 = p.toUpperCase();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
