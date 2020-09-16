package java_study.study200602;

import java.util.Random;

public class DataSetTester {
    static Random random = new Random();
    static Dataset dataset;
    static Dataset dataset1;
    private void test(){
        for(int i = 0; i<100; i++) {
            dataset.add(new Rectangle(random.nextDouble() * 100 - 1, random.nextDouble() * 100 - 1));
        }
        for(int i = 0; i< 100; i++){
            dataset1.add(new BankAccount(random.nextDouble() * 10000 - 1));
        }
    }

    public static void main(String[] args) {
        dataset = new Dataset();
        dataset1 = new Dataset();
        DataSetTester dataSetTester = new DataSetTester();
        dataSetTester.test();
        System.out.println("면적이 가장 큰 Rectangle: "+dataset.getMaximum());
        System.out.println("면적이 가장 큰 Rectangle의 면적: "+dataset.getMaximum().getMeasure());
        System.out.println("면적의 평균: "+dataset.getAverage());
        System.out.println();
        System.out.println("가장 잔액이 많은 계좌 : "+dataset1.getMaximum());
        System.out.println("가장 잔액이 적은 계좌: "+dataset1.getMinimum());
        System.out.println("잔액의 평균: "+dataset1.getAverage());
    }
}
