package java_study.study200520;

import java.util.Random;

public class P2 {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0; i<5;i++){
            System.out.printf("%d ",random.nextInt(50));
        }
    }
}
