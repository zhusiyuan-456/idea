import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    private QuickSort(){}
    public static <E extends Comparable<E>> void sort(E[]arr){
        Random random=new Random();
        sort(arr,0,arr.length-1,random);

    };
    private static <E extends Comparable<E>> void sort(E[]arr, int l, int r,Random random){
        if (l>=r) return;
     int p=partition(arr,l,r,random);
        sort(arr,l,p-1,random);
        sort(arr,p+1,r,random);
    }
    private static <E extends Comparable<E>> int partition(E[] arr, int l, int r,Random random){
        //arr[l+1...j]<v, arr[j+1...i-1]>v
        int p= random.nextInt(r-l+1)+l;
        swap(arr,l,p);
        int j=l;
        E v=arr[l];
        for (int i = l+1; i <=r ; i++) {
            if (arr[i].compareTo(v)<0){
                j++;
                swap(arr, j, i);

            }
        }
        swap(arr,l,j);
        return j;
    }
    public static<E>  void swap(E[]arr,int i,int j){
        E temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        int n=10000;
        Integer[] arr=ArrayGenerator.GenerateRandomArray(n,n);
        Integer[] arr2= Arrays.copyOf(arr,arr.length);
        Integer[] arr3= Arrays.copyOf(arr,arr.length);
        SortingHelper.sortTest("QuickSort",arr2);
        SortingHelper.sortTest("QuickSort",arr3);
        Integer[] arr4=ArrayGenerator.GenerateRandomArray(n,1);
        SortingHelper.sortTest("QuickSort",arr4);

    }
}
