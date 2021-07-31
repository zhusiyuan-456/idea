import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tri {
//	the complexity O(n)

    public static void main(String[] args) {

        point p1 = new point(0,0);
        point p2 = new point(25.5,3.0);
        point p3 = new point(20,10.2);
        point p4 = new point(10,0);
        point p5 = new point(15.2,10.0);
        point p6 = new point(2.5,7.6);
        point p7 = new point(14.5,2);
        point p8 = new point(13.2,12.6);
        point p9 = new point(22.8,18.7);
        point p10 = new point(0.1,0.1);
        point p11 = new point(30.5,8.7);
        point p12 = new point(11.2,3.2);
        List<point> t1 = Arrays.asList(p1,p2,p3);
        List<point> t2 = Arrays.asList(p4,p5,p6);
        List<point> t3 = Arrays.asList(p7,p8,p9);
        List<List<point>> triangles = Arrays.asList(t1,t2,t3);
        List<point> points = Arrays.asList(p10,p11,p12);
        tri tri = new tri();
        tri.cntInsideTri(triangles,points).stream().forEach(System.out::println);
//        System.out.println(i);

    }


    public boolean isInTriangle(List<point> triangle, point P) {

        point A = triangle.get(0);
        point B = triangle.get(1);
        point C = triangle.get(2);
        double a = 0, b = 0, c = 0;

        point MA = new point(P.x - A.x, P.y - A.y);
        point MB = new point(P.x - B.x, P.y - B.y);
        point MC = new point(P.x - C.x, P.y - C.y);


        a = MA.x * MB.y - MA.y * MB.x;
        b = MB.x * MC.y - MB.y * MC.x;
        c = MC.x * MA.y - MC.y * MA.x;

        if ((a <= 0 && b <= 0 && c <= 0) ||
                (a > 0 && b > 0 && c > 0))
            return true;
        return false;
    }

    List<Integer> cntInsideTri(List<List<point>> triangles, List<point> points) {

        List<Integer> res = new ArrayList<>();
        for (point p : points) {
            int cnt = 0;
            for (List<point> t : triangles) {
                if (isInTriangle(t, p)) cnt++;
            }
            res.add(cnt);
        }
        return res;
    }


}

class point {
    double x;
    double y;
    public point(double x, double y)
    {
        this.x=x;
        this.y=y;
    }
}