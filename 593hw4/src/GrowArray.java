//import java.util.Arrays;
//import java.util.Scanner;
//
//public class GrowArray {
//    private int[] array;
//    private int size;
//
//    public GrowArray(int capacity) {
//        array = new int[capacity];
//        size = 0;
//    }
//
//    private GrowArray() {
//        this(1);
//    }
//
//    public void add(int Index, int Element) {
//        if (Index < 0 || Index > size)
//            throw new IllegalArgumentException("Index out of bound");
//        if (size == array.length)
//            resize(2 * array.length);
//        for (int i = size - 1; i >= Index; i--)
//            array[i + 1] = array[i];
//        array[Index] = Element;
//        size++;
//
//    }
//
//    public void addStart(int n) {
//        add(0, n);
//    }
//
//    public void addEnd(int n) {
//        add(size, n);
//    }
//
//
//    private void resize(int x) {
//        int[] newArray = new int[x];
//        for (int i = 0; i < size; i++)
//            newArray[i] = (array[i]);
//        array = newArray;
//
//    }
//
//    private void Delete(int Index){
//        if (Index < 0 || Index > size)
//            throw new IllegalArgumentException("Index out of bound");
//        for (int i=Index-1;i<size;i++)
//            array[i]=array[i+1];
//
//        if (size==array.length/2)
//            resize(array.length/2);
//        size--;
//    }
//
//    public void DeleteStart(){
//        Delete(0);
//    }
//    public void DeleteEnd(){
//        Delete(size-1);
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder s = new StringBuilder();
//        s.append("[");
//        for (int i = 0; i < size; i++) {
//            s.append(array[i]);
//            if (i != size)
//                s.append(",");
//        }
//        s.append("]");
//        return s.toString();
//
//    }
//
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//        GrowArray A = new GrowArray();
//        for (int i=0;i<a;i++)
//          A.addEnd(i);
//        System.out.println(Arrays.toString(A.array));
//        for (int i=0;i<b;i++)
//         A.addStart(b);
//        System.out.println(Arrays.toString(A.array));
//
//
//    }
//}
