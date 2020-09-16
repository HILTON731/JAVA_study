package java_study.study200520;

import java.util.Random;

class LottoGenerator {
    private Random random;

    public LottoGenerator(){
        random = new Random();
    }

    public int[] generateNumbers(){

        int[] numbers;

        numbers = new int[6];

        for(int i = 0;i<6;i++){
            numbers[i] = random.nextInt(50);
        }

        return numbers;
    }
}
public class P3{
    public static void main(String[] args) {
        int[] numbers;
        LottoGenerator generator = new LottoGenerator();

        for (int n = 0; n < 10; n++){
            numbers = generator.generateNumbers();

            for(int i = 0; i < 6; i++)
                System.out.printf("%d ", numbers[i]);
            System.out.println();
        }
    }
}