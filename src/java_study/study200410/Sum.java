package java_study.study200410;

public class Sum {
    public static void main(String[] args) {

        int low = 10;
        int high = 100;
        int sum = 0;
        for(int i =low;i<=high;i++){
            if(i%3==0)sum+=i;
        }
        System.out.printf("%d이상 %d 이하인 3의 배수의 합 = %d",low,high,sum);
    }
}
