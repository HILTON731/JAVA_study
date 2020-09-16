package java_study.study200520;

import java.util.Random;

public class P8 {
    private int dukVotes;
    private int sunVotes;

    public void voteForDuk(){
        dukVotes++;
    }
    public void voteForSun(){
        sunVotes++;
    }
    public void clear(){
        dukVotes=0;
        sunVotes=0;
    }
    public int getDukVotes(){
        return dukVotes;
    }
    public int getSunVotes(){
        return sunVotes;
    }

    public static void main(String[] args) {
        Random random = new Random();
        P8 voteMachine = new P8();

        for(int i=0; i<1000;i++){
            if(random.nextBoolean())
                voteMachine.voteForSun();
            else
                voteMachine.voteForDuk();
        }
        System.out.println("순대 득표수 : "+voteMachine.getSunVotes());
        System.out.println("떡볶이 득표수 : "+voteMachine.getDukVotes());
    }
}
