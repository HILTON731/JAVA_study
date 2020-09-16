package java_study.study200602;

import java.util.*;

public class AsListTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, -3, 5, -7);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        Compare cm = new Compare();
        Collections.sort(list,cm);
        System.out.println(list);

    }
}
class Compare implements Comparator<Integer>{
    public int compare(Integer int1, Integer int2){
        return Integer.compare(Math.abs(int1),Math.abs(int2));
    }
}
