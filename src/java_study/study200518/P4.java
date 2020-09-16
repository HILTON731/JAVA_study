package java_study.study200518;

public class P4 {

    private int count = 0;
    public final int MAX = 10;

    public void tick(){
        count ++;
        if (count > MAX)
            count = 0;
    }
    public int getCount(){
        return count;
    }
    public void setCount(int number){
        if(isInputValid(number))
            count = number;
    }
    private boolean isInputValid(int number){
        if (number < 0)
            return false;
        if (number > MAX)
            return false;
        return true;
    }

    public static void main(String[] args) {

        P4 counter = new P4();
        counter.setCount(8);

        counter.tick();
        System.out.println("count value = " + counter.getCount());
        counter.tick();
        System.out.println("count value = " + counter.getCount());
        counter.tick();
        System.out.println("count value = " + counter.getCount());
        counter.tick();
        System.out.println("count value = " + counter.getCount());
        System.out.println();

        counter.setCount(12);
        System.out.println("tried to set 12 in counter");
        System.out.println("count value = " + counter.getCount());

        counter.setCount(5);
        System.out.println("tried to set 5 in counter");
        System.out.println("count value = " + counter.getCount());
    }
}
