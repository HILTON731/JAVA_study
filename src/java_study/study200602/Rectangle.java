package java_study.study200602;

import java.util.ArrayList;
import java.util.Random;

public class Rectangle implements Measurable, Comparable<Rectangle> {
    private double width, height;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public void setDimension(double width, double height){
        this.width = width;
        this.height = height;
    }
    public String toString(){
        return String.format("Rectangle[width=%.1f, height=%.1f]",width, height);
    }

    @Override
    public double getMeasure() {
        return width;
    }

    @Override
    public int compareTo(Rectangle o) {
        if(o.getMeasure() < getMeasure())
            return 0;
        else
            return -1;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
}
