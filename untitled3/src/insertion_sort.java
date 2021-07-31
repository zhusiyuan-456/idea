import java.util.Arrays;
import java.util.Random;

public class insertion_sort{
    public static<E extends Comparable<E>> void  InsertionSort(E[] arr){
        for (int i=0;i<arr.length ;i++ ) {
            for (int j=i;j-1>=0 ;j-- ) {
                if (arr[j].compareTo(arr[j-1])<0) {
                    swap(arr[j],arr[j-1]);
                }
            }
        }
    }
    public static<E> void swap(E arr1,E arr2){
        E temp=arr1;
        arr1=arr2;
        arr2=temp;
    }
    public  static Integer[] GenerateRandomArray(int n,int bound){
        Integer[] arr=new Integer[n];
        Random rnd=new Random();
        for (int i = 0; i <n; i++) {
            arr[i]=rnd.nextInt(bound);
        }
        return arr;
    }
    public static void main(String[] args) {
        Integer[] Testarray=GenerateRandomArray(10,10);
        InsertionSort(Testarray);
        System.out.print(Arrays.toString(Testarray));


    }
}
