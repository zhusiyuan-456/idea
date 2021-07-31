
public class array<Element> {
    private Element[] data;
    private int size;

    //constructor using parameter capacity to build array
    public array(int capacity) {
        data = (Element[]) new Object[capacity];
        size = 0;
    }

    //default constructor
    public array() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addEnd(Element n) {
        add(size, n);

    }

    public void addStart(Element n) {
        add(0, n);
    }

    public void add(int index, Element element) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("wdnmd, index out of bound");
        if (size == data.length)
            resize(2 * data.length);
        for (int i = size - 1; i >= index; i--)
            data[i + 1] = data[i];
        data[index] = element;
        size++;
    }

    Element getData(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Index out of bound, get fail");
        return data[index];
    }

    void setData(int index, Element element) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Index out of bound, get fail");
        data[index] = element;
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

    public boolean Contain(Element e) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(e))
                return true;
        }
        return false;
    }

    //find the index of the required element
    public int Find(Element e) {

        for (int i = 0; i < size; i++) {
            if (data[i].equals(e))
                return i;
        }
        return -1;
    }

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

    public Element DeleteFirst() {
        return Delete(0);
    }

    public Element DeleteLast() {
        return Delete(size - 1);
    }

    public void DeleteElement(Element e) {
        int Index = Find(e);
        if (Index != 0)
            Delete(Index);
    }

    private void resize(int x) {
        Element[] arr = (Element[]) new Object[x];
        for (int i = 0; i < size; i++)
            arr[i] = data[i];
        data = arr;
    }
    public Element getLast(){
      return   getData(size-1);
    }
    public Element getFirst(){
        return getData(0);
    }


    public static void main(String[] args) {
        array<Integer> A = new array<>(20);
//        for (int i = 0; i < 20; i++)
//            A.addEnd(i);
//        System.out.println(A);
//
//        A.addEnd(2);
//        A.addEnd(2233);
//        System.out.println(A);
//        A.DeleteLast();
//        System.out.println(A);
//        for (int i = 0; i < 12; i++)
//            A.DeleteLast();
          A.addStart(1);
        System.out.println(A);
    }

}
