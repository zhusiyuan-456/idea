import java.util.Arrays;
import java.util.Random;

public class QuickSort3Ways {
    private QuickSort3Ways(){}
    public static <E extends Comparable<E>> void sort3Ways(E[]arr){
        Random random=new Random();
        sort3Ways(arr,0,arr.length-1,random);
    };
    private static <E extends Comparable<E>> void sort3Ways(E[]arr,int l,int r,Random random){
        if (l>=r) return;
        int p=l+random.nextInt(r-l+1);
        swap(arr,l,p);
        //循环不变量
        //arr[l+1...lt]<v, arr[lt+1...gt-1]==v, arr[gt...r]>v
       int lt=l,gt=r+1,i=l+1;
       while(gt>i){
           if (arr[i].compareTo(arr[l])<0){
               lt++;
               swap(arr,lt,i);
               i++;
           }
           else if (arr[i].compareTo(arr[l])>0){
               gt--;
               swap(arr,i,gt);
           }
           else {
               i++;
           }
       }
       swap(arr,l,lt);
       sort3Ways(arr,l,lt-1,random);
       sort3Ways(arr,gt,r,random);
    }
    public static<E>  void swap(E[]arr,int i,int j){
        E temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        Integer [] A={5,6,2,1,3,7,9,8,4,0};
        sort3Ways(A);
        System.out.println(Arrays.toString(A));
    }
}
