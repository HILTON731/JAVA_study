package java_study.study200518;

public class P5 {
    private int count = 0;
    private int max = 10;

    public void setMax(int max){
        this.max = max;
    }
    public void tick(){
        count ++;
        if (count > max)
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
        if (number > max)
            return false;
        return true;
    }
    public static void main(String[] args) {

        P5 counter12 = new P5();
        P5 counter60 = new P5();

        counter12.setMax(12);
        counter60.setMax(60);

        counter12.setCount(11);

        counter12.tick();
        System.out.println("count value = " + counter12.getCount());
        counter12.tick();
        System.out.println("count value = " + counter12.getCount());
        counter12.tick();
        System.out.println("count value = " + counter12.getCount());
        counter12.tick();
        System.out.println("count value = " + counter12.getCount());
        System.out.println();

        counter60.setCount(59);

        counter60.tick();
        System.out.println("count value = " + counter60.getCount());
        counter60.tick();
        System.out.println("count value = " + counter60.getCount());
        counter60.tick();
        System.out.println("count value = " + counter60.getCount());
        counter60.tick();
        System.out.println("count value = " + counter60.getCount());
        System.out.println();
    }
}
