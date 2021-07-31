package remove_duplicates;
import java.util.Arrays;
public class solution {
    public int removeDuplicates(int[] arr){
        if(arr==null||arr.length==0)return 0;
        int count=0;
        for (int i=1;i<arr.length;i++)
            if(arr[i-1]!=arr[i]) {
                arr[count] = arr[i];
                count++;
            }
        System.out.println(Arrays.toString(arr));
        return count;
    }
}
