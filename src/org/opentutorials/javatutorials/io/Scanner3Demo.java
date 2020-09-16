package org.opentutorials.javatutorials.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner3Demo {
    public static void main(String[] args) {
        try{
            File file = new File("in.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextInt()){
                System.out.println(sc.nextInt() * 1000);
            }
            sc.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
            //try, catch: 예외
        }
    }
}
//CLI(Command Line Interface): 명령 인터페이스
//GUI(Graphic User Interface): 그래픽 사용자 인터페이스