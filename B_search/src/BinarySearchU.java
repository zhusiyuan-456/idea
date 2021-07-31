public class BinarySearchU {
    //find the smallest element greater than target
    // >target
    public static int search(int[] arr, int target) {
        return search(arr, 0, arr.length, target);
    }

    private static int search(int[] arr, int l, int r, int target) {
        if (l == r) return l;
        int mid = l + (r - l) / 2;
        if (arr[mid] > target) {
            return search(arr, l, mid, target);
        } else if (arr[mid] <= target) {
            return search(arr, mid + 1, r, target);
        }
        return -1;
    }

    public static int search2(int[] arr, int target) {
       int u= search(arr,target);
       if (u-1 >0 && arr[u-1]==target)
           return u-1;
       else return u;
    }


    public static void main(String[] args) {
        int[] A = {1,1,3,3,5,5,7,7,7,9,9};
        int b = search(A, 12);
        System.out.println(b);
    }
}
