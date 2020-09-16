package java_study.study200414;

public class P6 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        System.out.println("10보다 작은 정수 난수");
        for(int i =0; i<20;i++){
            numbers[i] = (int)(10*Math.random());
            System.out.println(numbers[i]);
        }
    }
}
