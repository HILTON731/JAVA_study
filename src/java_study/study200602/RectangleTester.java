package java_study.study200602;

import java.lang.reflect.Array;
import java.util.*;

class RectangleTester {
    static ArrayList<Rectangle> rectangles = new ArrayList<>();
    static Rectangle[] rectangle = new Rectangle[3];
    private void test(){
        Random random = new Random();


        for(int i = 0; i < 3; i ++) {
            double a = random.nextDouble()*100.0;
            double b = random.nextDouble() * 100.0;
            Rectangle rectangle_t = new Rectangle(a, b);
            rectangles.add(rectangle_t);
            rectangle[i] = rectangle_t;
        }
        Arrays.sort(rectangle);
        Collections.sort(rectangles);
    }

    public static void main(String[] args) {
        RectangleTester rectangleTester = new RectangleTester();
        rectangleTester.test();
        for(Rectangle re : rectangles){
            System.out.println(re.toString());
        }
        System.out.println();
        for(Rectangle re : rectangle){
            System.out.println(re.toString());
        }
        System.out.println();
        Iterator<Rectangle> iterator = rectangles.iterator();
        while(iterator.hasNext()){
            Rectangle i = iterator.next();
            System.out.println(i.toString());
        }
        System.out.println("\nArrayList의 첫 사각형 크기를 (1.0, 2.0)으로 변경\n");
        rectangles.get(0).setDimension(1.0,2.0);
        for(Rectangle re : rectangle){
            System.out.println(re.toString());
        }
        System.out.println();
        iterator = rectangles.iterator();
        while(iterator.hasNext()){
            Rectangle i = iterator.next();
            System.out.println(i.toString());
        }
        System.out.println("\nArrayList의 첫 사각형 크기를 (1.0, 2.0)으로 변경\n");
        rectangles.set(0, new Rectangle(5.0,5.0));

        for(Rectangle re : rectangle){
            System.out.print(re.toString()+" ");
        }
        System.out.println();
        iterator = rectangles.iterator();
        while(iterator.hasNext()){
            Rectangle i = iterator.next();
            System.out.print(i.toString()+" ");
        }
        System.out.println();
        System.out.println("-------------------------");
        System.out.println(Arrays.toString(rectangle));
        System.out.println(rectangles);
        System.out.println();
        System.out.println("-------------------------");
        rectangles.set(0, new Rectangle(0.1,200.0));
        DiagonalComparator da = new DiagonalComparator();
        Collections.sort(rectangles, da);
        System.out.println(rectangles);
    }
}
