package dke.algorithm.assignment.hanoi;

public class HanoiTower {
    public static void main(String[] args) {
        hanoiTower(2, 'A','B','C');
    }
    public static void hanoiTower(int n, char base, char temp, char swap){

        if(n == 1){
            System.out.println(base+" --> "+temp);
            return;
        }

        hanoiTower(n-1, base, swap, temp);
        System.out.println(base+" --> "+temp);
        hanoiTower(n-1, swap, temp, base);
    }
}
