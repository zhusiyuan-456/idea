import java.util.concurrent.BlockingQueue;

public class arrayQueue<E> implements Queue<E> {
    private array<E> array;

    public arrayQueue(int capacity) {
        array = new array<>(capacity);
    }

    public arrayQueue() {
        array = new array<>();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public void enqueue(E e) {
        array.addEnd(e);
    }

    @Override
    public E dequeue() {
        return array.DeleteFirst();
    }

    @Override
    public E getFront() {
        return array.getData(0);
    }

    @Override
    public String toString() {
        StringBuilder aString = new StringBuilder();
        aString.append(String.format("Queue of Size %d\n", array.getSize()));
        aString.append("Front [");
        for (int i = 0; i < array.getSize(); i++) {
            aString.append(array.getData(i));
            if (i != array.getSize() - 1)
                aString.append(",");
        }
        aString.append("] Tail");
        return aString.toString();
    }

    public static void main(String[] args) {
        arrayQueue<Integer> arr1 = new arrayQueue<>(2);
        new Thread(() -> {
            for (int i=0;i<100;i++){
                arr1.enqueue(i);
            }

        }, "T1_write").start();
        new Thread(() -> {
            for (int i=0;i<100;i++){
                arr1.enqueue(i);
            }
        }, "T2_read").start();

        new Thread(() -> {
            for (int i=0;i<100;i++){
                arr1.enqueue(i);
            }
        }, "T3_read").start();

        new Thread(() -> {
            for (int i=0;i<100;i++){
                arr1.enqueue(i);
            }

        }, "T5_write").start();
        }

    }


