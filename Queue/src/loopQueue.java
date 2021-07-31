public class loopQueue<E> implements Queue<E> {
    private E[] data;
    private int front,tail;
    private int size;
    public loopQueue(int capacity){
        data=(E[])new Object[capacity+1];
        front=0;
        tail=0;
        size=0;
    }
    public loopQueue(){
        this(10);
    }
    public int getCapacity(){
        return data.length-1;
    }
    @Override
    public boolean isEmpty(){
        return front==tail;
    }
    @Override
    public int getSize(){
        return size;
    }

    @Override
    public void enqueue(E e){
        if (tail==front)
            resize(2*getCapacity());
        data[tail]=e;
        tail=(tail+1)%data.length;
        size++;
    }
    @Override
    public E dequeue(){
        if (front==tail)
            throw new IllegalArgumentException("cannot dequeue an empty queue");
        E ret=data[front];
        data[front]=null;
        front=(front+1)%data.length;
        size--;
        if (size==getCapacity()/4 && getCapacity()/2 !=0)
            resize(getCapacity()/2);
        return ret;
    }
    private void resize(int newCapacity){
        E[] newData=(E[]) new Object[newCapacity+1];
        for (int i=0;i<size;i++)
            newData[i]=data[(i+front)%data.length];
        data=newData;
        front=0;
        tail=size;
    }
    @Override
    public E getFront(){
        if (front==tail)
            throw new IllegalArgumentException("nothing in the queue");
        return data[front];
    }
    @Override
    public String toString(){
        StringBuilder aString = new StringBuilder();
        aString.append(String.format("LoopQueue : Size %d, Capacity: %d\n", size, getCapacity()));
        aString.append("front  [");
        for (int i = front; i !=tail; i=(i+1)%data.length) {
            aString.append(data[i]);
            if ((i+1)%data.length != tail)
                aString.append(" ");
        }
        aString.append("] tail ");
        return aString.toString();
    }

    public static void main(String[] args) {
        loopQueue<Integer> arr = new loopQueue<>();
        for (int i = 0; i < 10; i++) {
            arr.enqueue(i);
        }
            System.out.println(arr);
        arr.dequeue();
        System.out.println(arr);
        arr.enqueue(100);
        System.out.println(arr);
    }
}
//to optimize the complexity of arrayQueue;