import java.util.Arrays;

public class demo1 {

    public static void InsertionSort(int[] arr) {
       for (int i=0;i<arr.length;i++){
           for (int j=i+1;j-1>=0 && j<arr.length;j--)
               if (arr[j-1]>arr[j])
                   swap(arr,j,j-1);
       }

    }
    private static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }


    public static void main(String[] args) {
        int[] array={7,4,3,8,5,1,9,2,10,14,1,2,3,3,1,2,1};
        InsertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
