import java.util.Arrays;

public class InsertionSort {
    private InsertionSort() {
    }

    public static <T extends Comparable<T>> void sort(T[] arr) {
        for (int i = arr.length-1; i >=0; i--) {
            T temp = arr[i];
            int j;
            for (j = i; j +1 <= arr.length-1 && temp.compareTo(arr[j + 1]) > 0; j++) {
                    arr[j] = arr[j +1];
            }
            arr[j] = temp;
        }
    }
public static <E extends Comparable<E>> void sort2(E[] arr){
        for (int i=0;i<arr.length;i++)
            for (int j=i;j-1>=0;j--){
                if (arr[j].compareTo(arr[j-1])<=0)
                    swap(arr,j,j-1);
            }
}
    private static<E>  void swap(E[] array, int a, int b) {
        E temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args) {
//        int[] dataSize = {10000, 100000};
//        for (int n : dataSize) {
//            Integer[] arr = ArrayGenerator.GenerateRandomArray(n, n);
//            SortingHelper.sortTest("InsertionSort", arr);
//            System.out.println("OrderedArray");
//           Integer[] arr2= ArrayGenerator.GenerateOrderedArray(n);
//           Integer[] arr3= Arrays.copyOf(arr2,n);
//            SortingHelper.sortTest("InsertionSort",arr2);
//            SortingHelper.sortTest("SelectionSort",arr3);
//        }
        Integer[] array={4,2,7,5,3,123,23,1,4534,75};
        sort2(array);
        System.out.println(Arrays.toString(array));
    }
}