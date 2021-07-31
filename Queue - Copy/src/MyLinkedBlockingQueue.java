public class MyLinkedBlockingQueue {

    private LinkedListQueue<Integer> integerLinkedListQueue = new LinkedListQueue<>();
    private int maxSize;
    //object lock
    private Object lock = new Object();

    public MyLinkedBlockingQueue(int maxSize) {
        this.maxSize = maxSize;
        System.out.println("Thread" + Thread.currentThread().getName() + "Thread initialized completed, which size is " + maxSize);
        System.out.println("---------------------------------------");
    }
    public void write(int element) {
        synchronized (lock) {
            //Check the queue is full or not
            try {
                if (this.integerLinkedListQueue.getSize() == maxSize) {
                    System.out.println("Thread" + Thread.currentThread().getName() + "The Queue is full, write method now waiting");
                    lock.wait(1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            // Queue is not full
            this.integerLinkedListQueue.enqueue(element);
            System.out.println("Thread" + Thread.currentThread().getName() + " adds element  " + element);
            lock.notifyAll();
        }
    }
    public void read() {
        synchronized (lock) {
            if (this.integerLinkedListQueue.getSize() == 1) {
                System.out.println("Thread" + Thread.currentThread().getName() + " Thread is now empty,read is  waiting");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //not an empty queue

            int result = integerLinkedListQueue.getFront();
            integerLinkedListQueue.dequeue();
            System.out.println("Thread" + Thread.currentThread().getName() + "  takes the element " + result);

            lock.notifyAll();
        }
    }

    public static void main(String[] args)  {
        MyLinkedBlockingQueue lq=new MyLinkedBlockingQueue(10);
        new Thread(() -> {
            for (int i=0;i<10;i++){
                lq.write(i);
            }

        }, "T1_write").start();
        new Thread(() -> {
            for (int i=0;i<15;i++){
                lq.read();
            }
        }, "T2_read").start();

        new Thread(() -> {
            for (int i=0;i<6;i++){
                lq.write(i*i);
            }
        }, "T3_write").start();

        new Thread(()->{
            for (int i=0;i<6;i++){
                lq.read();
            }
        },"T4_read").start();
        new Thread(() -> {
            for (int i=0;i<8;i++){
                lq.write(3*i);
            }
        }, "T5_write").start();
        new Thread(() -> {
            for (int i=0;i<4;i++){
                lq.write(5*i);
            }
        }, "T6_write").start();


    }
}







