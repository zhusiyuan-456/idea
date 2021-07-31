package QuickSort;

public class QuickSort2 {
    private QuickSort2(){}
    public static void sort(int[] arr){ }
    private static int partition(int[] arr, int l, int r){
        int i=l+1,j=r;
        while(true){
            if (arr[i]<arr[l]){
                i++;
            }
            else if (arr[j]>arr[l]){
                j--;
            }
            if (i>=j)
                break;
            swap(arr,i,j);
            i++;
            j--;
        }
        swap(arr,l,j);
        return j;
    }
    public static void swap(int[] arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
