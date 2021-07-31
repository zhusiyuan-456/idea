import java.util.Arrays;
import java.util.Scanner;
/*
the program will prompt user to enter 10 numbers to build an array, then find the minimum element and its index in the
array; Then use Bubble Sort to sort it and show the sorted array;
 */
public class Assignment3_part2 {
    public static double[]  FindMin(){
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.println("the list is"+Arrays.toString(numbers));
        System.out.println("The minimum number is: " + min(numbers));
        return numbers;
    }
    public static double min(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public static int FindMinIndex(double[] array) {
        double min=min(array);
        for (int i=0;i<array.length;i++){
            if (array[i]==min)
                return i;
        }
        return -1;
    }
    public static double[] bubbleSort(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        double[] A=FindMin();
        System.out.println("The Index of min element in array is " + FindMinIndex(A));
        bubbleSort(A);
        System.out.println("after sort: "+Arrays.toString(A));
    }
}
