package java_study.study200410;

public class Powers {
    public static void main(String[] args) {
        for(int i = 0;i<7;i++){
            for(int j =0 ; j<7;j++){
                System.out.print(powers(i, j)+"\t");
            }
            System.out.println();
        }
    }
    public static int powers(int b, int p){
        int temp = 1;
        for(int i =0; i<p;i++){
            temp *= b;
        }
        return temp;
    }
}
