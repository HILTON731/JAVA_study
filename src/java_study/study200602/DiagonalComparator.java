package java_study.study200602;

import java.util.Comparator;

public class DiagonalComparator implements Comparator<Rectangle> {
    public int compare(Rectangle r1, Rectangle r2){
        double rec1 = Math.sqrt(Math.pow(r1.getHeight(),2)+Math.pow(r1.getWidth()/r1.getHeight(),2));
        double rec2 = Math.sqrt(Math.pow(r2.getHeight(),2)+Math.pow(r2.getWidth()/r2.getHeight(),2));
        return Double.compare(rec2, rec1);
    }
}
