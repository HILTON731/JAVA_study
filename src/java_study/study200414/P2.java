package java_study.study200414;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        System.out.println("정수를 차례로 입력하시오:");
        System.out.println("입력을 마치려면 'q', 혹은 'Q'를 입력하시오:");
        int[] num = new int[100];
        Scanner sc = new Scanner(System.in);
        String temp;
        int i;
        for (i = 0; ; i++) {
            temp = sc.next();
            if (temp.equalsIgnoreCase("q"))
                break;

            num[i] = Integer.parseInt(temp);

        }
        System.out.println("배열을 역순으로 출력:");
        for (int j = i-1; j > -1; j--) {
            System.out.printf("%d\t", num[j]);
        }
    }
}
