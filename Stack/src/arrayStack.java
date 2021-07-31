public class arrayStack<E> implements Stack<E> {
    array<E> arr;

    public arrayStack(int capacity) {
        arr = new array<>(capacity);
    }

    public arrayStack() {
        arr = new array<>();
    }

    @Override
    public int getSize() {
        return arr.getSize();
    }

    @Override
    public boolean isEmpty() {
        return arr.isEmpty();
    }

    @Override
    public E peek() {
        return arr.getLast();
    }

    public int getCapacity() {
        return arr.getCapacity();
    }

    @Override
    public E pop() {
        return arr.DeleteLast();
    }

    @Override
    public void push(E e) {
        arr.addEnd(e);
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Stack :");
        stringBuilder.append("[");
        for (int i = 0; i < arr.getSize(); i++) {
            stringBuilder.append(arr.getData(i));
            if (i != arr.getSize() - 1)
                stringBuilder.append(",");
        }
        stringBuilder.append("]");
        return toString();
    }


}
