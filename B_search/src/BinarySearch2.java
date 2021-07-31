public class BinarySearch2 {
    public static int  search(int[]arr,int target){
        int l=0, r=arr.length;//设置成这样是因为可以覆盖整个数组 in this way we can cover the whole array;
        //循环不变量 arr[l,r)
        while(l<r){
            int mid=l+(r-l)/2;
            if (arr[mid]==target)return mid;
            if (arr[mid]<target){
                l=mid+1;
            }else{
                r=mid;
            }

        }
        return -1;
    }
}
