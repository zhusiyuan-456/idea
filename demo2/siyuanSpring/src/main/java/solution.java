import java.util.HashMap;

public class solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> temp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            temp.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int res=target-nums[i];
            if(temp.containsKey(res) && temp.get(res)!=i){
                return new int[]{i,temp.get(res)};
            }
        }
        return new int[]{-1,-1};
    }
}
