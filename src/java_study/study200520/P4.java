package java_study.study200520;

import java.util.Random;

class Dice{
    public final int MAX = 6;
    Random random;

    public Dice(){
        random = new Random();
    }
    public int roll(){
        return random.nextInt(MAX) + 1;
    }
}
class Dices {
    private Dice dice1;
    private Dice dice2;

    public Dices(){
        dice1 = new Dice();
        dice2 = new Dice();
    }
    public int roll(){

        return dice1.roll() + dice2.roll();
    }
}
class DiceCasting1{
    public void print_sum(){
        Dices runs = new Dices();
        for(int i = 0; i < 20;i++){
            System.out.println(runs.roll());
        }
    }
}
class DiceCasting2 {
    int[] cases;
    public void check_roll(){
        cases = new int[13];

        for(int i = 0; i<1000;i++){
            Dices dice = new Dices();
            cases[dice.roll()]++;
        }
        for(int i = 0; i<12;i++){
            System.out.printf("%d:\t%d\n",(i+1),cases[i]);
        }
    }
}
public class P4{
    public static void main(String[] args) {
        DiceCasting1 one = new DiceCasting1();
        DiceCasting2 two = new DiceCasting2();

        System.out.println("Dicecasting1");
        one.print_sum();

        System.out.println("DiceCasting2");
        two.check_roll();
    }
}