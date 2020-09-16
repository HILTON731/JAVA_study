package java_study.study200402;

public class P4 {
    public static void main(String[] args) {
        for(double i = -40; i<101;i++){
            double temp = convert(i);
            System.out.printf("C = %f --> F = %f\n",i,temp);

        }
    }
    public static Double convert(double temp){
        return temp*9.0/5.0+32.0;
    }
}
