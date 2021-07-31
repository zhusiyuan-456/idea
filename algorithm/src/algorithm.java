import java.util.*;
import java.util.Arrays;
public class algorithm {
    public static void main(String[] args) {
        double[] a= new double[10];
        for (int i=0;i<10;i++){
            a[i]=10-i;
        }

        Arrays.sort(a);
        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
