package sorting;
import java.util.Arrays;
import java.util.*;

public class InsertSort {
    public static void main(String[] args) {
        int[]x=new int[]{2,4,5,7,34,65,12,56,87,231,21};
        System.out.println(x.length);
        System.out.println(Arrays.toString(x));
        insert_sort(x);
        System.out.println(Arrays.toString(x));
        InsertSort(x);
        System.out.println(Arrays.toString(x));




    }

    public static void insert_sort(int[] array){
        //遍历每一个元素
        for (int i=1;i<array.length;i++)
            //后面的比前面小
            if (array[i]<array[i-1]){
                int temp=array[i];
                int j;
                for ( j=i-1;temp<array[j] &&j>=0;j--)
                    array[j+1]=array[j];
                array[j+1]=temp;
            }
    }
    public static void InsertSort(int[] arr){
        int temp
;
        for (int i=1;i<arr.length;i++){
            for (int j=i;j>0 && arr[j]<arr[j-1];j--) {
                temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
            }
        }


    }
}
