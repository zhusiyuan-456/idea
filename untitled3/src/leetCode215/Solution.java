package leetCode215;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
      return   selectK(nums,0,nums.length-1,k);
    }
    private static int selectK(int[] arr,int l, int r ,int k){
        int p=partition(arr,l,r);
        if (k==p)
            return arr[p];
         if (k<p)
            return selectK(arr,l,p-1,k);

            return selectK(arr,p+1,r,k);


    }

    private static int partition(int[]arr, int l,int r){
      int i=l+1, j=r;
      while(true){
          while (i<=j && arr[i]<arr[l]){
              i++;
          }
          while (j>=i && arr[j]>arr[l]){
              j--;
          }

          if (i>=j)break;
              swap(arr,i,j);
              i++;
              j--;
              //This is because arr[l+1,i-1] and arr[j+1,r]
      }
        swap(arr,l,j);
        return j;
    }

    private static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        int [] A={5,6,2,1,3,7,9,8,4,0};
        System.out.println((new Solution()).findKthLargest(A,1));
    }
}
