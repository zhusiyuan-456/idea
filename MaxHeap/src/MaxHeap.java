

public class MaxHeap<E extends Comparable<E>> {
    private array<E> data;

    public MaxHeap(int capacity) {
        data = new array(capacity);
    }

    public MaxHeap() {
        data = new array();
    }

    public int getSize() {
        return data.getSize();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    private int parent(int index) {
        if (index == 0)
            throw new IllegalArgumentException("index 0 does not have parent!!");
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return index * 2 + 1;
    }

    private int rightChild(int index) {
        return index * 2 + 2;
    }

    public void add(E e) {
        data.addEnd(e);
        siftUp(data.getSize() - 1);
    }

    private void siftUp(int index) {
        while (index > 0 && data.getData(parent(index)).compareTo(data.getData(index)) < 0) {
            data.swap(index, parent(index));
            index = parent(index);
        }
    }

    public E findMax() {
        if (data.getSize() == 0)
            throw new IllegalArgumentException("Empty array!");
        return (E) data.getData(0);
    }

    public E extractMax() {
        E ret = findMax();
        data.swap(0, getSize() - 1);
        data.DeleteLast();
        siftDown(0);
        return ret;
    }

    private void siftDown(int k) {
        while (leftChild(k) < data.getSize()) {
            int j = leftChild(k);
            if (j + 1 < data.getSize() && data.getData(j + 1).compareTo(data.getData(j)) > 0) {
                j = rightChild(k);
                //data[j] contains the bigger element in leftChild and rightChild
            }
            if (data.getData(k).compareTo(data.getData(j)) >= 0) {
                break;
            }
            data.swap(k, j);
            k = j;
        }
    }
}
