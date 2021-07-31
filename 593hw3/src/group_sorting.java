import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class group_sorting {

 public static int[] random_array(int[] array){
     Random rand = new Random();

     for (int i = 0; i < array.length; i++) {
         int randomIndexToSwap = rand.nextInt(array.length);
         int temp = array[randomIndexToSwap];
         array[randomIndexToSwap] = array[i];
         array[i] = temp;
     }

     System.out.println("random_array :");
     System.out.println(Arrays.toString(array));
     return array;
 }



    public static void main(String[] args) throws FileNotFoundException {


        File ReadIn = new File("C:\\Users\\absno\\Desktop\\array.txt");
        Scanner read_in_number= new Scanner(ReadIn);
        int range=read_in_number.nextInt();
        int times=read_in_number.nextInt();
        int next_range=read_in_number.nextInt();
        int[] array=new int[range];
        for (int j=1;j<=range;j++)
            array[j-1]=j;
 for (int i=0;i<times;i++) {

    int[] shuffled_array = random_array(array);
    int[] copy_Array1 = Arrays.copyOf(shuffled_array, range);
    int[] copy_Array2 = Arrays.copyOf(shuffled_array, range);
    int[] copy_Array3 = Arrays.copyOf(shuffled_array, range);
    //quick_sort
    qucik_sort.quickSort(copy_Array1, 0, range - 1);
    System.out.println("QuickSort");
    System.out.println(Arrays.toString(copy_Array1));

    //heap_sort
    heap_sort.sort(copy_Array2, range - 1);
    System.out.println("Heapsort");
    System.out.println(Arrays.toString(copy_Array2));
    //merge_sort
    MergeSort.mergeSort(copy_Array3);
    System.out.println("MergeSort");
    System.out.println(Arrays.toString(copy_Array3));
    System.out.println();
}
        System.out.println("sort array with  new length");
 //sort with new length
        array=new int[next_range];
        for (int j=1;j<=next_range;j++)
            array[j-1]=j;
        for (int i=0;i<times;i++){
            int[] shuffled_array = random_array(array);
            int[] copy_Array1 = Arrays.copyOf(shuffled_array, next_range);
            int[] copy_Array2 = Arrays.copyOf(shuffled_array, next_range);
            int[] copy_Array3 = Arrays.copyOf(shuffled_array, next_range);
            //quick_sort
            qucik_sort.quickSort(copy_Array1, 0, next_range - 1);
            System.out.println("QuickSort");
            System.out.println(Arrays.toString(copy_Array1));

            //heap_sort
            heap_sort.sort(copy_Array2, next_range - 1);
            System.out.println("Heapsort");
            System.out.println(Arrays.toString(copy_Array2));
            //merge_sort
            MergeSort.mergeSort(copy_Array3);
            System.out.println("MergeSort");
            System.out.println(Arrays.toString(copy_Array3));
            System.out.println();
        }


    //record run_time
        int[] x = new int[(int) Math.pow(10, 6)];
        for (int i = 0; i < Math.pow(10, 6); i++)
            x[i] = i;
        int[] x1=x;
        int[] x2=x;
        double startTime = System.nanoTime();
        qucik_sort.quickSort(x,0,x.length-1);
        double endTime = System.nanoTime();
        double timeElapsed = endTime - startTime;
        System.out.println("arrayi with length of 10^6");
        System.out.print("Running time for quicksort:");
        System.out.println(timeElapsed/ 1000000+"ms");

        startTime = System.nanoTime();
        MergeSort.mergeSort(x2);
         endTime = System.nanoTime();
         timeElapsed = endTime - startTime;
        System.out.print("Running time for mergesort:" );
        System.out.println(timeElapsed/ 1000000+"ms");

        startTime = System.nanoTime();
        heap_sort.sort(x1,(int)Math.pow(10,6));
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.print("Running time for heapsort:" );
        System.out.println(timeElapsed/ 1000000+"ms");

        System.out.println("array2 with the length of 10^7");
        int[] y = new int[(int) Math.pow(10, 7)];
        for (int i = 0; i < Math.pow(10, 7); i++)
            y[i] = i;
        int[] y1=y;
        int[] y2=y;
        startTime = System.nanoTime();
        qucik_sort.quickSort(y,0,y.length-1);
         endTime = System.nanoTime();
         timeElapsed = endTime - startTime;
        System.out.print("Running time for quicksort:" );
        System.out.println(timeElapsed/ 1000000+"ms");

        startTime = System.nanoTime();
        MergeSort.mergeSort(y2);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.print("Running time for mergesort:");
        System.out.println(timeElapsed/ 1000000+"ms");

        startTime = System.nanoTime();
        heap_sort.sort(y1,(int)Math.pow(10,7));
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.print("Running time for heapsort:");
        System.out.println(timeElapsed/ 1000000+"ms");


        System.out.println("array2 with the length of 10^8");
        int[] z = new int[(int) Math.pow(10, 8)];
        for (int i = 0; i < Math.pow(10, 8); i++)
            z[i] = i;
        int[] z1=z;
        int[] z2=z;
        startTime = System.nanoTime();
        qucik_sort.quickSort(z,0,z.length-1);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.print("Running time for quicksort:" );
        System.out.println(timeElapsed/ 1000000+"ms");

        startTime = System.nanoTime();
        MergeSort.mergeSort(z2);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.print("Running time for mergesort:");
        System.out.println(timeElapsed/ 1000000+"ms");

        startTime = System.nanoTime();
        heap_sort.sort(z1,(int)Math.pow(10,8));
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.print("Running time for heapsort:");
        System.out.println(timeElapsed/ 1000000+"ms");

    }



    static class qucik_sort{
        public static void quickSort(int[] arr, int low, int high){

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

        public static int partition(int[] arr, int start, int end){
            int pivot = arr[end];

            for(int i=start; i<end; i++){
                if(arr[i]<=pivot){
                    int temp= arr[start];
                    arr[start]=arr[i];
                    arr[i]=temp;
                    start++;
                }
            }

            int temp = arr[start];
            arr[start] = pivot;
            arr[end] = temp;

            return start;
        }
    }


   static class heap_sort{
        public static void sort(int arrA[],int size) {
             size = arrA.length;

            // Build heap
            for (int i = size / 2 - 1; i >= 0; i--)
                heapify(arrA, size, i);

            // One by one extract (Max) an element from heap and
            // replace it with the last element in the array
            for (int i=size-1; i>=0; i--) {

                //arrA[0] is a root of the heap and is the max element in heap
                int x = arrA[0];
                arrA[0] = arrA[i];
                arrA[i] = x;

                // call max heapify on the reduced heap
                heapify(arrA, i, 0);
            }
        }

        // To heapify a subtree with node i
        static void heapify(int arrA[], int heapSize, int i) {
            int largest = i; // Initialize largest as root
            int leftChildIdx  = 2*i + 1; // left = 2*i + 1
            int rightChildIdx  = 2*i + 2; // right = 2*i + 2

            // If left child is larger than root
            if (leftChildIdx  < heapSize && arrA[leftChildIdx ] > arrA[largest])
                largest = leftChildIdx ;

            // If right child is larger than largest so far
            if (rightChildIdx  < heapSize && arrA[rightChildIdx ] > arrA[largest])
                largest = rightChildIdx ;

            // If largest is not root
            if (largest != i) {
                int swap = arrA[i];
                arrA[i] = arrA[largest];
                arrA[largest] = swap;

                // Recursive call to  heapify the sub-tree
                heapify(arrA, heapSize, largest);
            }
        }
    }
    static class  MergeSort{
        public static void mergeSort(int[] list) {
            if (list.length > 1) {
                // Merge sort the first half
                //Using Divide and conquer we split the list in half
                //and process recursively until the list is sorted.

                //Split the first first half
                int[] firstHalf = new int[list.length / 2]; // runs n times
                System.arraycopy(list, 0, firstHalf, 0, list.length / 2); //runs n times
                mergeSort(firstHalf); //runs n times

                // Split the second half
                int secondHalfLength = list.length - list.length / 2; //runs n times
                int[] secondHalf = new int[secondHalfLength]; //runs n times
                System.arraycopy(list, list.length / 2,
                        secondHalf, 0, secondHalfLength); //runs n times
                mergeSort(secondHalf); //runs n times

                // Merge firstHalf with secondHalf
                //Now that the list has been split to a smaller size
                //then we can try to merge it
                int[] temp = merge(firstHalf, secondHalf); //runs n times
                System.arraycopy(temp, 0, list, 0, temp.length); //runs n times
            }
        }

        /** Merge two sorted lists */
        private static int[] merge(int[] list1, int[] list2) {
            int[] temp = new int[list1.length + list2.length];

            int current1 = 0; // Current index in list1
            int current2 = 0; // Current index in list2
            int current3 = 0; // Current index in temp

            //Loop the elements
            while (current1 < list1.length && current2 < list2.length) { //Runs n - 1
                //Compare the elements in each list and add to the merge list
                if (list1[current1] < list2[current2])
                    temp[current3++] = list1[current1++];
                else
                    temp[current3++] = list2[current2++];
            }
            //Copy the rest of elements into the list
            while (current1 < list1.length)
                temp[current3++] = list1[current1++];
            //Copy the rest of elements into the list
            while (current2 < list2.length)
                temp[current3++] = list2[current2++];

            return temp;
        }



    }
}

