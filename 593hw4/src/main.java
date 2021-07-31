import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2=arr1;
        arr1[1]=0;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
