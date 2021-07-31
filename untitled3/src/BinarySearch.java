//using recursion
import java.util.Arrays;

public class BinarySearch {
    private BinarySearch(){}
    public static int searchR(int[] arr,int l, int r,int k){
         int mid=l+(r-l)/2;
         if (arr[mid]==k)
             return mid;
         else if (arr[mid]>k){
             return searchR(arr,l,mid-1,k);
         }else {
             return searchR(arr, mid + 1, r, k);
         }

    }

    public static void main(String[] args) {
        Integer [] A={5,6,2,1,3,7,10,8,4,0};
        QuickSort.sort(A);
        int [] B=new int[A.length];
        for (int i=0;i<A.length;i++){
            B[i]=A[i];
        }
        System.out.println(Arrays.toString(A));
        System.out.println( searchR(B,0,A.length-1,10));
    }

}
