import java.util.Scanner;

public class grow_array<Element> {
    private Element[] data;
    private int size;

    //constructor using parameter capacity to build array
    public grow_array(int capacity) {
        data = (Element[]) new Object[capacity];
        size = 0;
    }

    //default constructor
    public grow_array() {
        this(1);
    }


//O(1)
    public void addEnd(Element n) {
        add(size, n);

    }
    //O(n)
    public void addStart(Element n) {
        add(0, n);
    }

    //O(n)
    public void add(int index, Element element) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException(" index out of bound");
        if (size == data.length)
            resize(2 * data.length);
        for (int i = size - 1; i >= index; i--)
            data[i + 1] = data[i];
        data[index] = element;
        size++;
    }




    @Override
    public String toString() {
        StringBuilder aString = new StringBuilder();
        aString.append(String.format("Array : Size %d, Capacity: %d\n", size, data.length));
        aString.append('[');
        for (int i = 0; i < size; i++) {
            aString.append(data[i]);
            if (i != size - 1)
                aString.append(",");
        }
        aString.append(']');
        return aString.toString();
    }


//O(n)
    public Element Delete(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Index out of bound, Delete fail");
        Element temp = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        if (size == data.length / 2)
            resize(data.length / 2);
        return temp;
    }
    //O(n)
    public Element DeleteFirst() {
        return Delete(0);
    }
    //O(1)
    public Element DeleteLast() {
        return Delete(size - 1);
    }



    //O(n)
    private void resize(int x) {
        Element[] arr = (Element[]) new Object[x];
        for (int i = 0; i < size; i++)
            arr[i] = data[i];
        data = arr;
    }
    public int sum(){
        int sum=0;
        for (int i=0;i<size;i++)
            sum+=(int)data[i];
        return sum;
    }

    /**
     * you can print it out if you want :)
     *
     */



    public static void main(String[] args) {
        grow_array<Integer> GrowArray = new grow_array<>();
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        for (int i=0;i<a;i++)
            GrowArray.addEnd(i);
     //   System.out.println(GrowArray);

        for (int i=0;i<b;i++)
            GrowArray.addStart(b);
        //System.out.println(GrowArray);

        for (int i=0;i<b;i++)
            GrowArray.add(c,i);
     //   System.out.println(GrowArray);

        for (int i=0;i<a;i++)
            GrowArray.DeleteLast();
       // System.out.println(GrowArray);

        for (int i=0;i<b;i++)
            GrowArray.DeleteFirst();
       // System.out.println(GrowArray);

        System.out.println(GrowArray.sum());
    }

}
