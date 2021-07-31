import java.util.Arrays;
class QuickSort3Ways{
    private QuickSort3Ways(){}
    public static void sort(int[] arr){
        sort(arr,0,arr.length-1);
    }
    private static void sort(int[] arr, int l, int r){
        if (l>=r) return ;
        int lt=l, gt=r+1, i=l+1;
        while(i<gt){
            if (arr[i]<arr[l]) {
                lt++;
                swap(arr,lt,i);
                i++;
            }
            else if (arr[i]>arr[l]) {
                gt--;
                swap(arr,i,gt);
            }
            else{
                i++;
            }
        }
        swap(arr,l,lt);
        sort(arr,l,lt-1);
        sort(arr,gt,r);
    }
    public static void swap( int[] arr, int j,int i){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    public static void main(String[] args) {
        int n=10000;
        Integer[] arr=ArrayGenerator.GenerateRandomArray(n,n);
        Integer[] arr2= Arrays.copyOf(arr,arr.length);

    }
}
