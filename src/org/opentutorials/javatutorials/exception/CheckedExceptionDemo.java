package org.opentutorials.javatutorials.exception;
import java.io.*;
public class CheckedExceptionDemo {
    public static void main(String[] args) {
        BufferedReader bReader = null;
        String input = null;

        try {
            bReader = new BufferedReader(new FileReader("in.txt"));
            //"in.txt"에 문제가 생기면 내부적으로 예외를 발생시켜 처리하도록 하는것 (= throw)
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            input = bReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(input);
    }
}
