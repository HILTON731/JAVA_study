package java_study.study200402;

public class P5 {
    public static void main(String[] args) {
        for(int i = 100; i<121; i++){
            summation(i);
        }
    }
    public static void summation(int num){
        int sum=0;
        for(int i = 0 ; i<=num; i++)
            sum+=i;
        System.out.printf("Summation fo natural numbers upto %d = %d\n",num,sum);
    }
}
