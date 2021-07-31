//without recursion
public class BinarySearch2 {
    private BinarySearch2() {
    }

    public static int search(int[] arr, int k) {
        int l = 0, r = arr.length - 1;
        //循环不变量 ：arr[l,r] ，在l,r范围内寻target;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == k)
                return mid;
            else if (arr[mid] > k) {
                r = mid - 1;
            }
            else
            l = mid + 1;

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {0, 2, 3, 4, 6, 8};
        int res = search(A, 0);
        System.out.println(res);
    }
}





