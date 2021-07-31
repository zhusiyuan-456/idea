/*
import  java.util.Scanner;
import  java.io.File;
import  java.util.Random;
public class GroupSorting {

    public static int[][]  Generate_Array(int range,int times){
        int[][] Random_Array= new int[times][range];
        for (int i=0;i<times;i++)
            for (int j=0;j<range;j++)
                Random_Array[i][j]=(int)(Math.random() * (range + 1) );


//        for (int i=0;i<times;i++) {
//            for (int j = 0; j < range; j++) {
//                System.out.print(Random_Array[i][j]);
//                System.out.print(' ');
//            }
//            System.out.println();
//        }


return Random_Array;
    }

    public static void main(String[] args) throws Exception{
    File ReadIn = new File("C:\\Users\\absno\\Desktop\\array.txt");
    Scanner read_in_number= new Scanner(ReadIn);
    int range=read_in_number.nextInt();
    int times=read_in_number.nextInt();
    int another_number=read_in_number.nextInt();
    //int random_int = (int)(Math.random() * (10 + 1) );
       int[][] Random_Array= Generate_Array(range,times);


}

static class qucik_sort{
    public static void quickSort(int[] arr, int start, int end){

        int partition = partition(arr, start, end);

        if(partition-1>start) {
            quickSort(arr, start, partition - 1);
        }
        if(partition+1<end) {
            quickSort(arr, partition + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];

        for(int i=start; i<end; i++){
            if(arr[i]<pivot){
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





}

 */