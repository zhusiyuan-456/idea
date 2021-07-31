import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo5 {

    public List<int[]> twoSum6(int[] nums, int target) {
    if (nums == null || nums.length < 2)
        return null;
    Arrays.sort(nums);
    List<int[]> results = new ArrayList<>();

    int left = 0, right = nums.length - 1;

    while (left < right) {
        int v = nums[left] + nums[right];
        if (v == target) {
            int[] result = {nums[left], nums[right]};
            results.add(result);
            left++; right--;

            while (left < right && nums[right] == nums[right + 1]) {
                right--;
            }

            while (left < right && nums[left] == nums[left - 1]){
                left++;
            }
        } else if (v > target) {
            right--;
        } else {
            left++;
        }
    }

    return results;
}
}
