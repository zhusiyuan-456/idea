import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class MyBlockingQueue {
    private List<Integer> integerList = new ArrayList<>();
    private int maxSize;
    //object lock
    private final Object lock = new Object();

    public MyBlockingQueue(int maxSize) {
        this.maxSize = maxSize;
        System.out.println("Thread" + Thread.currentThread().getName() + "Thread initialized completed, which size is " + maxSize);
        System.out.println("---------------------------------------");
    }

    //producer
    public void put(int element) {
        synchronized (lock) {
            //Check the queue is full or not
            try {
                if (this.integerList.size() == maxSize) {
                    System.out.println("Thread" + Thread.currentThread().getName() + " The Queue is full, put method now waiting");
                    lock.wait();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            // Queue is not full
            this.integerList.add(element);
            System.out.println("Thread" + Thread.currentThread().getName() + " adds element  " + element);
            lock.notifyAll();
        }
    }

    //consumer
    public void take() {
        synchronized (lock) {
            if (this.integerList.size() == 0) {
                System.out.println("Thread" + Thread.currentThread().getName() + " Thread is now empty,take is  waiting");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //not an empty queue

            int result = integerList.get(0);
            integerList.remove(0);
            System.out.println("Thread" + Thread.currentThread().getName() + "  takes the element " + result);

            lock.notifyAll();
        }
    }

    public static void main(String[] args) {
        MyBlockingQueue myBlockingQueue = new MyBlockingQueue(10);
        new Thread(() -> {
            for (int i = 0; i < 100; i++)
                myBlockingQueue.put(i);
        }, "T1_write").start();


        new Thread(() -> {
            for (int i = 0; i < 100; i++)
                myBlockingQueue.take();
        }, "T2_read").start();
//
//        new Thread(()->{
//            myBlockingQueue.put(4);
//
//        },"T3_write").start();
//
//
//        new Thread(()->{
//            myBlockingQueue.put(100);
//            myBlockingQueue.put(120);
//        },"T5_write").start();
//        new Thread(()->{
//            myBlockingQueue.put(300);
//            myBlockingQueue.put(320);
//        },"T6_write").start();
//        new Thread(()->{
//            myBlockingQueue.put(400);
//            myBlockingQueue.put(520);
//        },"T7_write").start();
//        new Thread(()->{
//            myBlockingQueue.put(700);
//            myBlockingQueue.put(800);
//        },"T7_write").start();
    }
}
