package java_study.study200419;

import java.util.ArrayList;
import java.util.Scanner;

import static java_study.study200419.P5.linearSearch;
import static java_study.study200419.P6.fillRandomDistinct;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list;
        int listLength;

        System.out.print("몇 개의 정수들을 보시겠습니까? ");
        listLength = sc.nextInt();

        list = new int[listLength];
        fillRandomDistinct(list,100);

        for(int i=0;i<list.length;i++){
            System.out.println(list[i]);
        }

        System.out.print("1을 입력하면 숫자를 감춥니다.");
        sc.nextInt();
        for(int i=0;i<100;i++)
            System.out.println();

        System.out.println("어떤 숫자들이 있었는지 맞춰보세요.");
        System.out.println("입력을 끝내려면 음수를 입력하세요.");
        int[] answer = new int[100];
        int temp;
        int answerNumber=0;
        while((temp = sc.nextInt())!=-1){
            answer[answerNumber]=temp;
            answerNumber++;
        }
        System.out.printf("%d개 맞췄습니다.\n",checkAnswers(list,answer,answerNumber));
    }
    public static int checkAnswers(int[] list, int[] answer, int answerNumber){
        int temp, count=0;
        for(int i=0;i<list.length;i++){
            temp=list[i];
            for(int j=0;j<i;j++){
                if(temp==list[j]){
                    temp=list[++i];
                }
            }
            if(linearSearch(answer,answerNumber,temp)!=-1)
                count++;
        }
        return count;
    }
}
