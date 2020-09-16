package java_study.study200520;

import java.util.Arrays;
import java.util.Scanner;

public class P5 {
    private String s;
    public P5(String s){
        this.s = s;
    }

    public String reverse(String str){
        StringBuilder result = new StringBuilder(str);
        return result.reverse().toString();
    }
    public String reverseWord(String str){
        StringBuilder rev_string = new StringBuilder();
        String[] string_list = str.split(" ");
        for(int i = string_list.length - 1;i>=0;i--){
            rev_string.append(string_list[i]);
        }
        return rev_string.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("문자열을 입력하세요: ");
        String s = input.nextLine();

        P5 reverser = new P5(s);
        String reversedString = null;
        reversedString = reverser.reverse(s);

        System.out.println("뒤집힌 문자열:");
        System.out.println(reversedString);

        String reversedWords = null;
        reversedWords = reverser.reverseWord(s);

        System.out.println("단어 단위로 뒤집힌 문자열:");
        System.out.println(reversedWords);

        input.close();
    }
}
