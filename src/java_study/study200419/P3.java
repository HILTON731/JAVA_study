package java_study.study200419;

import static java_study.study200419.P2.castDice;

public class P3 {
    public static void main(String[] args) {
        final int NUM_DICE = 2;
        final int TRIALS = 1000;
        final int HEIGHT = 50;

        int[] occurence = new int[6 * NUM_DICE +1];
        int number;

        for(int i=0;i<TRIALS;i++){
            number = castDice(NUM_DICE);
            occurence[number]++;
        }
        for(int i=0;i<occurence.length;i++)
            System.out.printf("%d이 나온 횟수: %d\n",i,occurence[i]);
        graph(occurence,HEIGHT);
    }
    public static int max(int[] a){
        int temp=a[0];
        for(int i=1;i<a.length;i++)
            if(a[i]>temp)temp = a[i];
        return temp;
    }
    public static void graph(int[] a, int height){
        int maximum;
        maximum = max(a);
        float quantum;
        quantum = (float)maximum/height;
        for(int i=0;i<a.length;i++){
            System.out.printf("%d:%d\t",i,a[i]);
            for(int j=0;j<(int)(a[i]/quantum);j++)
                System.out.printf("*");
            System.out.println();
        }
    }
}
