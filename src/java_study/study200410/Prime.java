package java_study.study200410;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("1 이상 정수를 입력하시오: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        System.out.printf("%d 이하 소수: ",num);
        for(int i = 0; i<=num;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        System.out.printf("%d개",count);
        sc.close();
    }
    public static boolean isPrime(int n){
        boolean prime = true;
        if(n<2)prime = false;
        else{
            for(int i=2;i<n;i++){
                if(n%i==0)prime = false;
            }
        }
        return prime;
    }
}
