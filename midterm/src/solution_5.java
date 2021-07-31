import java.util.*;
public class solution_5 {
    public static int[][] merge(int[][] intervals) {
        int n = intervals.length;
        boolean included[] = new boolean[n];
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        for(int i = 0;i<n;i++){
            if(!included[i]){
                included[i] = true;
                int min = intervals[i][0];
                int max = intervals[i][1];
                for(int j = i+1;j<n;j++){
                    int min1 = intervals[j][0];
                    int max1= intervals[j][1];
                    if(!included[j] && Math.min(min,min1)<=Math.min(max,max1) && Math.max(min,min1)<=Math.max(max,max1)
                            && Math.min(max,max1)>=Math.max(min,min1))
                    {
                        min = Math.min(min,min1);
                        max = Math.max(max,max1);
                        included[j] = true;
                    }
                }
                ArrayList<Integer> curr = new ArrayList();
                curr.add(min);
                curr.add(max);
                arr.add(curr);
            }
        }
        int res[][] = new int[arr.size()][2];
        for(int i = 0;i<arr.size();i++){
            res[i][0] = arr.get(i).get(0);
            res[i][1] = arr.get(i).get(1);
        }
        if(intervals.length == res.length)
            return res;
        return merge(res);
    }

    public static void main(String[] args) {
        System.out.print("how many intervals? : ");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=2;

        System.out.println("Enter array elements : ");

        int twoD[][]=new int[rows][columns];


        for(int i=0; i<rows;i++)
        {
            for(int j=0; j<columns;j++)
            {
                twoD[i][j]=sc.nextInt();
            }
        }

        System.out.println("your inputs:"+Arrays.deepToString(twoD));
        System.out.println("after overlap: "+Arrays.deepToString(merge(twoD)));
    }
}