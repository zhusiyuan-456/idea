public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int j;
            for (j = 1+i; j < length  ; j++)
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
        }
        throw new IllegalArgumentException("No two sum solution");

    }


    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] c = twoSum(nums, target);
        for (int i=0;i<2;i++)
            System.out.println(c[i]);
    }
}

