package QuickSort;

import java.util.Arrays;

public class QuickSort1 {
    private QuickSort1(){}
    public static void sort(int[] arr){
        sort(arr,0,arr.length-1);
    }
    private static void sort(int[] arr,int l,int r) {
        if (l>=r){
            return;
        }
        int p=partition(arr,l,r);
        sort(arr,l,p-1);
        sort(arr,p+1,r);
    }
    private static int partition(int[] arr,int l,int r){
        int v=arr[l];
        int j=l;
        for (int i=l+1;i<=r;i++){
            if (arr[i]<v){
                j++;
                swap(arr,i,j);

            }
        }
        swap(arr,l,j+1);
        return j;
    }
    public static  void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        int [] A={5,6,2,1,3,7,9,8,4,0};
        sort(A);
        System.out.println(Arrays.toString(A));
    }
}
