import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] array={6,3,2,5,1,4,8,9};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=a;
}

    public static void sort(int[] arr) {
        int minIndex ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j]<=arr[i]){
                    minIndex=arr[j];
                    arr[j]=arr[i];
                    arr[i]=minIndex;
                }
            }

        }
    }


}
