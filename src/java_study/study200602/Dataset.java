package java_study.study200602;

import java.awt.font.LineBreakMeasurer;

public class Dataset {
    private double sum;
    private Measurable maximum;
    private int count;
    private Measurable minimum;

    public Dataset() {
        sum = 0;
        count = 0;
        maximum = null;
    }
    public void add(Measurable x){
        sum = sum + x.getMeasure();
        if(count == 0 || maximum.getMeasure() < x.getMeasure())
            maximum = x;
        if(count == 0 || minimum.getMeasure() > x.getMeasure())
            minimum = x;
        count++;
    }
    public double getAverage(){
        if(count == 0)
            return 0;
        return sum / count;
    }
    public Measurable getMaximum(){
        return maximum;
    }
    public Measurable getMinimum(){
        return minimum;
    }
}
