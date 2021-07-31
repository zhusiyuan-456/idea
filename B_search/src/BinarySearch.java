public class BinarySearch {
    public static int search(int[] arr, int target){
        int l=0, r=arr.length-1;
        //循环不变量 arr[l,r]
          while(l<=r){
              int mid =l+(r-l)/2;
              if(arr[mid]==target)return mid;
              if (arr[mid]>target){
                  r=mid-1;
              }
              else {
                  l=mid+1;
              }
          }
          return -1;
    }


    public static void main(String[] args) {
        int[] A= {1,3,5,5,7,7,9};
       int p= search(A,6);
        System.out.println(p);
    }
}
