import java.util.Arrays;

public class MergeSort {
    private MergeSort(){};
    public static <E extends Comparable<E>> void Sort(E[] arr){
        mergeSort(arr,0,arr.length-1);
    };
    //Merge arr[l,mid]and arr[mid+1,r];
    private static <E extends Comparable<E>> void mergeSort(E[] arr,int l,int r){
        if (l>=r)
            return;
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,mid+1,r);
        Merge(arr,l,mid,r);
    }
    private static <E extends Comparable<E>> void Merge(E[] arr,int l,int mid,int r){
        E[] temp= Arrays.copyOfRange(arr,l,r+1);
        int i=l;
        int j=mid+1;
        //every round we assign arr[k];
        for (int k=l;k<=r;k++){
            //check if i or j is out of bound;
            if (i>mid){
                arr[k]=temp[j-l];
                j++;
            }
            else if (i<mid){
                arr[k]=temp[i-l];
                i++;
            }
            else{
                if (temp[i-l].compareTo(temp[j-l])<=0){
                    arr[k]=temp[i-l];
                    i++;
                }
                else{
                    arr[k]=temp[j-l];
                    j++;
                }
            }
        }
    }


}
