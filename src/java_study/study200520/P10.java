package java_study.study200520;

import java.util.Scanner;

public class P10 {
    public static int value;
    public void countUp(){
        value++;
    }
    public void countDown(){
        value--;
    }
    public void reset(){
        value=0;
    }
    public int getValue(){
        return value;
    }

    public static void main(String[] args) {
        P10 counter = new P10();
        Scanner sc = new Scanner(System.in);

        int num;
        while(true){
            num = sc.nextInt();
            if(num>0) {
                for (int i = 0; i < num; i++){
                    counter.countUp();
                }
                System.out.println(counter.getValue());
            }
            else{
                for(int i = num; i < 0;i++){
                    counter.countDown();
                    if(counter.getValue()==0)return;
                }
                System.out.println(counter.getValue());
            }
        }
    }
}
