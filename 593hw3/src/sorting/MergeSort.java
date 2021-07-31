package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array={1, 12, 7, 11, 14, 3, 4, 5, 6, 10, 13, 0, 2, 8, 9};
        mergeSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }


    public static void merge(int[] array,int low,int middle,int high){

        int[]temp=new int[high-low+1];
        //first half index
        int i=low;
        //second half index
        int j=middle+1;
        //index in temp
        int index=0;
        while(i<=middle && j<=high){
            if (array[i]<array[j]) {
                temp[index] = array[i];
                i++;
            }else{
              temp[index]=array[j];
              j++;
            }
            index++;
        }

        while (j<=high){
            temp[index]=array[i];
            j++;
            index++;
        }
        while (i<=middle){
            temp[index]=array[i];
            i++;
            index++;
        }

      for (int k=0;k<temp.length;k++)
         array[low+k]=temp[k];

    }
    public static void mergeSort(int[]arr,int low,int high){
        int middle = (low + high) / 2;
        if(low<high) {
            mergeSort(arr, low, middle);
            mergeSort(arr, middle + 1, high);
            merge(arr,low,middle,high);
        }
    }

}
