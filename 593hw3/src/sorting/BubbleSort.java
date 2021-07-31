package sorting;
import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
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
    public static void BubbleSort(int[] array){

        for (int i=0;i<array.length-1;i++)
            for (int j=0;j< array.length-1-i;j++)
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int [] Array=new int[] {2,4,5,6,7,82,3};
        int[]x= random_array(Array);
        BubbleSort(x);
    }
}
