public class SortingHelper {
    private SortingHelper() {
    }

    public static <T extends Comparable<T>> boolean isSorted(T[] arr) {
        for (int i=1;i<arr.length;i++){
            if (arr[i-1].compareTo(arr[i])>0)
                return  false;
        }
        return true;
    }


    public static <T extends Comparable<T>> void sortTest(String sortName,T[] arr){


        double startTime=System.nanoTime();
        if(sortName=="SelectionSort")
        SelectionSort.sort(arr);
        else if (sortName=="InsertionSort")
            InsertionSort.sort(arr);
        else if(sortName=="MergeSort")
            MergeSort.Sort(arr);
        else if(sortName=="QuickSort")
            QuickSort.sort(arr);
        double endTime=System.nanoTime();
        double time =(endTime-startTime)/1000000000;
        if (!SortingHelper.isSorted(arr))
            throw new RuntimeException("fuck");
        System.out.println(String.format("%s ,n=%d, time :%f ",sortName,arr.length,time));

    }
}
