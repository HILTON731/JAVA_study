package java_study.study200410;

import java.util.Scanner;

public class StringOperation {
    public static void main(String[] args) {
        System.out.print("문자열을 입력하시오: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.printf("문자열 길이: %d\n",str.length());
        while(true){
            System.out.println(str);
            str = str.substring(1);
            if(str.length()==0)break;
        }
        sc.close();
    }
}
