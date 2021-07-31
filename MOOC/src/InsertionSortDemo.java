import java.util.Arrays;

public class InsertionSortDemo {
    public static void sort (int[] arr){
        for (int i=1;i<arr.length;i++){
            for (int j=i;j>0;j--){
                if (arr[j]<arr[j-1])
                    swap(arr,j-1,j);
            }

        }
    }

    private static  void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args) {
        int[] array={4,2,7,5,3,123,23,1,4534,75};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

}
