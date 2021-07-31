package sorting;

import java.util.Arrays;
import java.util.Random;

public class random_array {
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

    public static void main(String[] args) {
        int []x=new int[15];
        for (int i = 0; i < 15; i++)
            x[i]=i;
        random_array(x);
    }
}
