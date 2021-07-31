package sorting;
import java.util.Arrays;
import java.util.Random;
import java.math.*;

public class QuickSort {
    public static void main(String[] args) {
        int[] x = new int[(int) Math.pow(10, 6)];
        for (int i = 0; i < Math.pow(10, 6); i++)
            x[i] = i;
        int[] x1 = x;
        int[] x2 = x;
        double startTime = System.nanoTime();
        quickSort(x, 0, x.length - 1);
        double endTime = System.nanoTime();
        double timeElapsed = endTime - startTime;
        System.out.println("array with length of 10^6");
        System.out.print("Running time for quicksort:");
        System.out.println(timeElapsed / 1000000 + "ms");

    }
        public static void quickSort ( int[] arr, int low, int high){

            while (low < high)
            {
        /* pi is partitioning index, arr[p] is now
           at right place */
                int pi = partition(arr, low, high);

                // If left part is smaller, then recur for left
                // part and handle right part iteratively
                if (pi - low < high - pi)
                {
                    quickSort(arr, low, pi - 1);
                    low = pi + 1;
                }

                // Else recur for right part
                else
                {
                    quickSort(arr, pi + 1, high);
                    high = pi - 1;
                }
            }


        }

        public static int partition ( int[] arr, int start, int end){
            int pivot = arr[end];

            for (int i = start; i < end; i++) {
                if (arr[i] <= pivot) {
                    int temp = arr[start];
                    arr[start] = arr[i];
                    arr[i] = temp;
                    start++;
                }
            }

            int temp = arr[start];
            arr[start] = pivot;
            arr[end] = temp;

            return start;
        }
    }
