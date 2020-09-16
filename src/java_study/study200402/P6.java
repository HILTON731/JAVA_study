package java_study.study200402;

public class P6 {
        public static void main(String[] args) {
            for(int i = 100; i<121; i++){
                System.out.printf("Summation fo natural numbers upto %d = %d\n",i,sumr(i));
            }
        }

    public static int sumr(int num){
        int sum=0;
        for(int i = 0 ; i<=num; i++)
            sum+=i;
        return sum;
    }
}
