import java.util.*;

class Solution {
    public Map<Integer,Integer> twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            hashMap.put(nums[i],i);
        }
        HashMap<Integer,Integer> res=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int ans=target-nums[i];
            if (hashMap.containsKey(ans) && hashMap.get(ans)!=i){
                res.put(ans,i);
                hashMap.remove(ans);
            }
        }
        return res;
    }
}