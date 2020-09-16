package java_study.study200403;

import java.util.ArrayList;
import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        System.out.println("정수의 자리 수를 알려줍니다.");
        System.out.println("정수를 입력하시오");
        System.out.println("int 타입 수이어야 하고 0이 아니어야 합니다.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        digits(num);
    }
    public static int powersOfTen(int n){
        int num=1;
        for(int i =0; i<n;i++){
            num*=10;
        }
        return num;
    }
    public static void digits(int n){
        int i=0,temp=n;
        ArrayList<Integer> arr = new ArrayList<>();
        while(temp!=0){
            i++;
            arr.add(temp);
            temp=n/powersOfTen(i);
        }
        System.out.println(i+"자리 수 입니다.");
        temp =n;
        for(int j=i;j>0;j--){
            //ver1
            temp=n/powersOfTen(j-1);
            n%=powersOfTen(j-1);
            System.out.printf("%d ",temp);

//            ver2
//            temp=n/powersOfTen(j-1);
//            temp%=10;
//            System.out.printf("%d ",temp);
//
//            ver 3
//            System.out.print("arr: "+arr.get(j-1)%10+' ');
        }
    }
}
