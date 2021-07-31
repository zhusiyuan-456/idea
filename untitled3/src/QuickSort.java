import java.util.Arrays;

public class QuickSort {
    private QuickSort(){}
    public static <E extends Comparable<E>> void sort(E[]arr){
        sort(arr,0,arr.length-1);
    };
    private static <E extends Comparable<E>> void sort(E[]arr,int l,int r){
        if (l>=r) return;
        int p=partition(arr,l,r);
        sort(arr,l,p-1);
        sort(arr,p+1,r);
    };
    private static <E extends Comparable<E>> int partition(E[] arr,int l,int r){
        //arr[l+1...j]<v, arr[j+1...i-1]>v
        int j=l;
        E v=arr[l];
        for (int i = l+1; i <=r ; i++) {
            if (arr[i].compareTo(v)<0){
                swap(arr, j+1, i);
                j++;
            }
        }
        swap(arr,l,j);
        //System.out.println(Arrays.toString(arr));
        return j;
    }


    public static <E extends Comparable<E>> void sort2Ways(E[]arr){
        sort2Ways(arr,0,arr.length-1);
    };
    private static <E extends Comparable<E>> void sort2Ways(E[]arr,int l,int r){
        if (l>=r) return;
        int p=partition2(arr,l,r);
        sort2Ways(arr,l,p-1);
        sort2Ways(arr,p+1,r);
    };
    private static <E extends Comparable<E>> int partition2(E[] arr,int l,int r){
        //arr[l+1...i-1]<=v, arr[j+1...r]>=v
        int i=l+1;
        int j=r;
        while(true){
            while(i<=j && arr[i].compareTo(arr[l])<0){
                i++;
            }
            while(j>=i && arr[j].compareTo(arr[l])>0){
                j--;
            }
            if (i>=j)
                break;
            swap(arr,i,j);
            i++;
            j--;
        }
        swap(arr,l,j);
        System.out.println(Arrays.toString(arr));
        return j;
    }
    public static<E>  void swap(E[]arr,int i,int j){
        E temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        Integer [] A={5,6,2,1,3,7,9,8,4,0};
        Integer [] B={5,6,2,1,3,7,9,8,4,0};
        sort(A);
        sort2Ways(B);
    }
}
