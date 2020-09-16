package java_study.study200414;

public class P7 {
    public static void main(String[] args) {
        final int SIZE = 10;
        int[] numbers = new int[SIZE];
        int sum = 0;
        System.out.println("100보다 작은 정수 난수");
        for(int i =0; i<10; i++){
            numbers[i] =(int)(Math.random()*100);
            sum+=numbers[i];
            System.out.println(numbers[i]);
        }
        System.out.println();
        int max = numbers[0];
        int min = numbers[9];
        for(int i = 0; i<SIZE;i++){
            if(max<numbers[i])
                max = numbers[i];
            if(min>numbers[i])
                min = numbers[i];
        }
        System.out.printf("원소들 중 최소값: %d\n",min);
        System.out.printf("원소들 중 최대값: %d\n",max);
        System.out.printf("원소들의 평균값: %f",(float)sum/10);

    }
}
