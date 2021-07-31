public class BinarySearchU2 {
    public static int upper(int[] arr, int target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] < target) {
                l = mid + 1;
            } else if (arr[mid] >= target) {
                r = mid;
            }
        }
        return l;
    }

    //<Target 的最大值
    public static int lower(int[] arr, int target) {
        int l = -1, r = arr.length - 1;
        while (r > l) {
            int mid = l + (r - l) / 2 + 1;
            if (arr[mid] < target) {
                l = mid;
            } else if (arr[mid] >= target) {
                r = mid - 1;
            }
        }
        return l;

    }
    public static int lower_floor(int[] arr, int target){
        int l=lower(arr,target);
        if (l+1<arr.length && arr[l+1]==target){
           return l+1;
        }else return l;
    }
//    public static int upper_floor(int[]arr,int target){
////        int u=upper(arr,target);
////        if ()
////    }
    public static int upper_binary(int[]arr, int target){
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] < target) {
                l = mid + 1;
            } else if (arr[mid] >= target) {
                r = mid;
            }
        }if (arr[l-1]==target)
        return l;
        else return -1;
    }
    public static void main(String[] args) {
        int[] A = {1,1,3,3,5,5,7,7,7,9,9};
        int[] B = {1,3,5,7,9};
        int b = lower_floor(B, 5);
        System.out.println(b);
    }
}

