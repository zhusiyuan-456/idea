public class MyArrayBlockingQueue {
    private arrayQueue<Integer> integerQueue = new arrayQueue<>(5);
    private int maxSize;
    //object lock
    private Object lock = new Object();

    public MyArrayBlockingQueue(int maxSize) {
        this.maxSize = maxSize;
        System.out.println("Thread" + Thread.currentThread().getName() + "Thread initialized completed, which size is " + maxSize);
        System.out.println("---------------------------------------");
    }


    public void write(int element) {
        synchronized (lock) {
            //Check the queue is full or not
            try {
                if (this.integerQueue.getSize() == maxSize) {
                    System.out.println("Thread" + Thread.currentThread().getName() + "The Queue is full, write method now waiting");
                    lock.wait(1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            // Queue is not full
            this.integerQueue.enqueue(element);
            System.out.println("Thread" + Thread.currentThread().getName() + " adds element  " + element);
            lock.notifyAll();
        }
    }

    public void read() {
        synchronized (lock) {
            if (this.integerQueue.getSize() == 0) {
                System.out.println("Thread " + Thread.currentThread().getName() + " Thread is now empty,read is  " +
                        "waiting");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //not an empty queue

            int result = integerQueue.getFront();
            integerQueue.dequeue();
            System.out.println("Thread " + Thread.currentThread().getName() + "  takes the element " + result);

            lock.notifyAll();
        }
    }

    public static void main(String[] args)  {
        MyArrayBlockingQueue myArrayBlockingQueue = new MyArrayBlockingQueue(5);
       new Thread(() -> {
            for(int i=0;i<10;i++){
                myArrayBlockingQueue.write(i);
            }

        }, "T1_write").start();
        new Thread(() -> {
            for(int i=0;i<10;i++){
                myArrayBlockingQueue.read();
            }
        }, "T2_read").start();
        //take 13 elements

        new Thread(() -> {
            for(int i=0;i<10;i++){
                myArrayBlockingQueue.write(2*i);
            }
        }, "T3_write").start();

        new Thread(()->{
            myArrayBlockingQueue.read();
            myArrayBlockingQueue.read();
        },"T4_read").start();
        new Thread(() -> {
            myArrayBlockingQueue.write(100);
            myArrayBlockingQueue.write(120);
        }, "T5_write").start();
        new Thread(() -> {
            myArrayBlockingQueue.write(300);
            myArrayBlockingQueue.write(320);
        }, "T6_write").start();


    }
}
