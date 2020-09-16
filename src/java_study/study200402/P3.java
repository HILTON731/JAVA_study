package java_study.study200402;

import java.util.*;

public class P3 {
    public static void main(String[] args) {
        for(int i = -40; i<101;i++){
            convertAndPrint(i);
        }
    }
    public static void convertAndPrint(double temp){
        double tempc = temp*9.0/5.0+32.0;
        System.out.printf("C = %f --> F = %f\n",temp,tempc);
    }
}
