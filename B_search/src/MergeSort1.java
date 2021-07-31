import java.util.Arrays;

public class MergeSort1 {
    public static void sort(int[]arr){
        sort(arr,0,arr.length);
    }
    private static void sort(int[]arr,int l,int r){
        if (l>=r-1) return;
        //sort arr[l,r);
        int mid =l+(r-l)/2;
        sort(arr,l,mid);
        sort(arr,mid,r);
        merge(arr,l,r,mid);
    }
    private static void merge(int[] arr,int l,int r,int mid){
        //合并 arr[l,mid),arr[mid,r)
        int i=l, j=mid;
        int[] temp= Arrays.copyOfRange(arr,l,r+1);
        for (int k=l;k<r;k++){
            if (i>=mid){
                arr[k]=temp[j-l];
                j++;
            }
            else if (j>=r){
                arr[k]=temp[i-l];
                i++;
            }
            else if (temp[i-l]<=temp[j-l]){
                arr[k]=temp[i-l];
                i++;
            }else {
                arr[k]=temp[j-l];
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int [] A={5,6,2,1,3,7,9,8,4,0};
        sort(A);
        System.out.println(Arrays.toString(A));
    }
}
