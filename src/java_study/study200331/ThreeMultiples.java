package java_study.study200331;

public class ThreeMultiples {
    public static void main(String[] args) {
        int scoreA=0, scoreB=0;
        for(int i=1; i<=100;i++){
            if(i%3==0)scoreA+=i;
        }
        for(int i=0;i<=100;i+=3){
            scoreB+=i;
        }
        System.out.println(scoreA);
        System.out.println(scoreB);
    }
}
