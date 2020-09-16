package java_study.study200414;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class P4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("integers.txt"));
        PrintWriter pw = new PrintWriter("reversedIntegers.txt");
        int [] numbers = new int[10];
        for(int i =0;i<10; i++){
            numbers[i] = sc.nextInt();
        }
        for(int i = numbers.length-1;i>-1;i--)
            pw.printf("%d ",numbers[i]);
        sc.close();
        pw.close();
    }
}
