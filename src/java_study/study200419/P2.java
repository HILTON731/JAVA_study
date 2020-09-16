package java_study.study200419;

public class P2 {
    public static void main(String[] args) {
        final int NUM_DICE = 1;
        final int TRIALS = 1000;

        int[] occurence;
        occurence = new int[NUM_DICE*6+1];
        for(int i=0;i<TRIALS;i++){
            occurence[castDice(NUM_DICE)]++;
        }
        for(int i=0;i<occurence.length;i++)
            System.out.printf("%d이 나온 횟수: %d\n",i,occurence[i]);
    }
    public static int castDice(int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=(int)(5*Math.random()+1);
        }
        return sum;
    }
}
