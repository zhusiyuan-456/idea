package HomeWork;

import java.util.Arrays;

public class AnotherWay {
    public static <T extends Comparable<T>> void sort(T[] arr) {
        int minIndex;
        for (int i = arr.length - 1; i >= 0; i--) {
            minIndex = i;
            for (int j = i; j < arr.length && j >= 0; j--) {
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
        int[] dataSize = {10, 10};
        for (int n : dataSize) {
            Integer[] arr = ArrayGenerator.GenerateRandomArray(n, n);
            sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}
