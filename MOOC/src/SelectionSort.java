import java.util.Arrays;
import java.util.Scanner;


public class SelectionSort {


    public static <T extends Comparable<T>> void sort(T[] arr) {
        int minIndex;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0)
                    minIndex = j;
            }
            swap(arr, minIndex, i);
        }
    }

    private static <T> void swap(T[] array, int a, int b) {
        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }


    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        Integer[] arr=ArrayGenerator.GenerateRandomArray(n,n);
//        Integer[] array = {6, 3, 2, 5, 1, 4};
//        System.out.println(Arrays.toString(array));
//        sort(array);
//        System.out.println(Arrays.toString(array));
//        Student[] students = {new Student("peter", 10011),
//                new Student("alice", 10075),
//                new Student("michel", 10099)};
//        sort(students);
//        for(Student student :students) {
//            System.out.println(student.toString());
//        }
// 
//        System.out.println();
        int[] dataSize = {10000, 100000};
        for (int n : dataSize) {
            Integer[] arr=ArrayGenerator.GenerateRandomArray(n, n);
            SortingHelper.sortTest("SelectionSort", arr);
        }
//        double startTime=System.nanoTime();
//        sort(arr);
//        double endTime=System.nanoTime();
//        double time =(endTime-startTime);
//        if (!SortingHelper.isSorted(arr))
//            throw new RuntimeException("fuck");
//        System.out.println("time: "+time+" seconds");

    }


}

