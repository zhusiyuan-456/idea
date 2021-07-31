import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class demo4 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        for (int num :nums){
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> priorityQueue=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for (Map.Entry<Integer,Integer> entry:hashMap.entrySet()){
            priorityQueue.add(entry);
        }
        int[] top=new int[k];
        for (int i=0;i<k;i++){
            top[i]=priorityQueue.poll().getKey();
        }
        return top;
    }
}
