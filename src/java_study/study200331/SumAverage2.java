package java_study.study200331;

import java.util.Scanner;

public class SumAverage2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0, sum = 0;
        double avg = 0.0;
        while (num > 0) {
            sum += num;
            count++;
            avg = (double)sum / count;
            num = sc.nextInt();
        }
        if (count == 0) {
            System.out.println(count);
        } else {
            System.out.println(count + "\n" + sum + "\n" + avg);
        }
    }
}
