import java.util.Arrays;
import java.util.Random;

public class LeetCode75 {
    public static void sortColors(int[] nums) {
        sortColors(nums,0,nums.length-1);
    }
    private static  void sortColors(int[]arr,int l,int r){
        if (l>=r) return ;
        int lt=-1, gt=r+1, i=0;
        while(i<gt){
            if (arr[i]<1) {
                lt++;
                swap(arr,lt,i);
                i++;
            }
            else if (arr[i]>1) {
                gt--;
                swap(arr,i,gt);
            }
            else{
                i++;
            }
        }

    }

    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        int [] A={2,0,2,1,1,0};
        sortColors(A);
        System.out.println(Arrays.toString(A));
    }
}
