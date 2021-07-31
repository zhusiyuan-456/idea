import java.util.Arrays;

public class MergeSort2 {
    //Private constructor avoid others use it;
    private MergeSort2() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static <E extends Comparable<E>> void sort(E[] arr, int l, int r) {
        if (l >= r) return;
        int mid = (l + r) / 2;
        sort(arr, l, mid);
        sort(arr, mid + 1, r);
        if (arr[mid].compareTo(arr[mid+1])>0)
        merge(arr, l, mid, r);
    }


    public static <E extends Comparable<E>> void merge(E[] arr, int l, int r, int mid) {
        E[] arr2 = Arrays.copyOfRange(arr, l, r + 1);
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                arr[k] = arr2[j - l];
                j++;
            } else if (j > r) {
                arr[k] = arr2[i - l];
                i++;
            } else if (arr2[i - l].compareTo(arr2[j - l]) <= 0) {
                arr[k] = arr2[i - l];
                i++;
            } else {
                arr[k] = arr2[j - l];
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Integer[] A = {5, 6, 2, 1, 3, 7, 9, 8, 4, 0};
        sort(A);
        System.out.println(Arrays.toString(A));
    }
}
