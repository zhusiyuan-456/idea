public class BinarySearchLowerCeil {
    public static int search(int[] arr, int target){
        int l=0, r=arr.length;
        while(r>l){
            int mid =l+(r-l)/2;
            if (arr[mid]>target){
                r=mid;
            }else if (arr[mid]<=target){
                l=mid+1;
            }
        }
        return l;
    }
    public static int upper(int[] arr, int target){
        int u=search(arr,target);
        if (arr[u-1]==target)
            return u-1;
        else return u;
    }
    public static int ceil(int[] arr,int target){
        int u=upper(arr,target);
        if (arr[u-1]==target) {
            while (arr[u - 1] == target) {
                u--;
            }
        }
         return u;
    }

    public static void main(String[] args) {
        int[] A = {1,1,3,3,5,5,7,7,7,9,9};
        int b = ceil(A, 5);
        System.out.println(b);
    }
}
