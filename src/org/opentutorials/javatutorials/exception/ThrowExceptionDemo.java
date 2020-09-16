package org.opentutorials.javatutorials.exception;
import java.io.*;
//최초생산자
class B{
    void run() throws FileNotFoundException, IOException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input);
    }
}
class C{
    void run() throws FileNotFoundException, IOException{
        B b = new B();
        b.run();
    }
}
//최종생산자
public class ThrowExceptionDemo {
    public static void main(String[] args) {
        C c = new C();
        try {
            c.run();
        } catch (FileNotFoundException e){
            System.out.println("in.txt 파일이 필요합니다");
        } catch (IOException e) {
            e.printStackTrace();
            //FileNOtFoundException은 IOException의 상속이기때문에 따로 필요 없음
        }
    }
}
