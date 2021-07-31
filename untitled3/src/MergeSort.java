import java.util.Arrays;

public class MergeSort {
   //Private constructor avoid others use it;
    private MergeSort(){}

    public static <E extends Comparable<E>> void sort(E[] arr){
        sort(arr,0,arr.length-1,0);
    }
    public static <E extends Comparable<E>> void sort(E[] arr,int l,int r,int depth){

        String depthString=generateDepthString(depth);
        System.out.println(depthString);
        System.out.println(String.format("MergeSort arr[%d, %d]",l,r));

        if (l>=r) return;
        int mid=(l+r)/2;
        sort(arr,l,mid,depth+1);
        sort(arr,mid+1,r,depth+1);
        merge(arr,l,r,mid);
        System.out.print(depthString);
        System.out.println(String.format("merge arr[%d, %d] and arr[%d, %d]", l, mid, mid + 1, r));

        merge(arr, l, mid, r);

        // 打印 merge 后的数组
        System.out.print(depthString);
        System.out.print(String.format("after mergesort arr[%d, %d] :", l, r));
        for(E e: arr)
            System.out.print(e + " ");
        System.out.println();
    }


    public static <E extends Comparable<E>> void merge(E[] arr,int l,int r,int mid){
        E[] arr2= Arrays.copyOfRange(arr,l,r+1);
        int i=l,j=mid+1;
        for (int k=l;k<=r;k++){
            if (i>mid){
                arr[k]=arr2[j-l];j++;
            }
            else if (j>r){
                arr[k]=arr2[i-l];i++;
            }
            else if (arr2[i-l].compareTo(arr2[j-l])<=0){
                arr[k]=arr2[i-l];
                i++;
            }
            else{
                arr[k]=arr2[j-l];
                j++;
            }
        }
    }
    private static String generateDepthString(int depth){
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < depth ; i ++)
            res.append("--");
        return res.toString();
    }

    public static void main(String[] args) {
        Integer [] A={5,6,2,1,3,7,9,8,4,0};
        sort(A);
        System.out.println(Arrays.toString(A));
    }
}
