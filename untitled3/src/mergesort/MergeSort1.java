package mergesort;

import java.util.Arrays;

public class MergeSort1 {
    private MergeSort1() {
    }

    public static void sort(int[] arr) {
        int[] temp = Arrays.copyOf(arr,arr.length);
        sort(arr, 0, arr.length-1,temp);
    }

    private static void sort(int[] arr, int l, int r,int[] temp) {
        if (l>=r)
            return;
        int mid=l+(r-l)/2;//same (r+l)/2

        sort(arr,l,mid,temp);
        sort(arr,mid+1,r,temp);
        merge(arr,l,r,mid,temp);
    }

    private static void merge(int[] arr, int l, int r, int mid,int[] temp) {
        System.arraycopy(arr,l,temp,l,r-l+1);
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                arr[k] = temp[j];
                j++;
            }
           else if (j > r) {
                arr[k] = temp[i ];
                i++;
            } else if (temp[i]<=temp[j]) {
                arr[k] = temp[i ];
                i++;
            } else {
                arr[k] = temp[j];
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