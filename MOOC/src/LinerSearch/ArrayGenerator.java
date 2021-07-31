package LinerSearch;
public class ArrayGenerator {
    private ArrayGenerator(){}

    public static Integer[] GenerateOrderedArray(Integer n){
        Integer[] arr=new Integer[n];
        for (int i=0;i<n;i++)
            arr[i]=i;
        return arr;
    }


}
