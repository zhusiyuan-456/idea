package QuickSort;

import java.util.Arrays;

public class QuickSort3 {
    private QuickSort3(){}
    public static void sort(int[] arr){
sort(arr,0,arr.length-1);
    }
    public static void sort(int[] arr, int l,int r){
        if (l>=r)return;
        //循环不变量: arr[l..lt]<v , arr[lt+1...gt-1]==v, arr[gt...r]>v
        int i=l+1, lt=l,gt=r+1;
        while(i<gt){
            if (arr[i]<arr[l]){
                lt++;
                swap(arr,i,lt);
                i++;
            }
            else if (arr[i]>arr[l]){
                gt--;
                swap(arr,i,gt);
            }
            else{
                i++;
            }

        }
        swap(arr,l,lt);
        //start recursion
        sort(arr,l,lt-1);
        sort(arr,gt,r);

    }
    public static void swap(int[] arr, int i,int j){
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
