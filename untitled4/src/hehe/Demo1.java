package hehe;
import java.util.*;
public class Demo1 {
    public static void main(String[] args) {
        shape[] shape1=new shape[3];
        shape1[0]=new rectangle(8);
        shape1[1]=new circle(3,4);
        System.out.println(shape1[0].area());
        System.out.println(shape1[1].area());
    }
}
abstract class shape{
    abstract double area();
}
class rectangle extends shape{
    private int r;
    public rectangle(int r){
        this.r=r;
    }

    @Override
    double area() {
        return Math.PI*r*r;
    }
}

class circle extends shape{
    private int width,height;
    public circle(int w,int h){
        width=w;
        height=h;
    }
    @Override
    double area() {
        return width*height;
    }
}