//import java.util.ArrayList;
//import java.util.*;
//
//public abstract class Shape {
//    abstract double volume();
//}
//
// class Sphere extends Shape{
//    private double R,x,y,z;
//    public Sphere(int x,int y,int z,double r){
//        this.x=x;
//        this.y=y;
//        this.z=z;
//        R=r;
//    }
//    public double volume(){
//        return (4/3)*Math.PI*R*R;
//    }
//
//}
//
//class Cube extends Shape{
//    private double r;
//    public Cube(double r){
//        this.r=r;
//    }
//    public double volume(){
//        return r*r*r;
//    }
//}
//
//public class ShapeTest {
//    public static void main(String[] args) {
//        ArrayList shapes = new ArrayList<>();
//        for (int y = 0; y < 3; y++)
//            for (int x = 0; x < 3; x++)
//                for (int z = 0; z < 3; z++)
//                    shapes.add(new Sphere(x*10, y*5, z*5, 2.5);
//        shapes.add(new Cube(30));
//
//        for (Shape s : shapes) {
//            System.out.println(s.volume());
//        }
//    }
//}