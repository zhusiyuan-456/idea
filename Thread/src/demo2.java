import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class demo2 {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue=new ArrayBlockingQueue<>(10);
        Thread t1=new Thread(()->{
            try {
                queue.put(1);
                queue.put(2);
                queue.put(3);
                queue.put(4);
                queue.put(5);
                queue.put(6);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t1");
        Thread t2=new Thread(()->{
            try {
                queue.take();
                queue.take();
                queue.take();
                queue.take();
                queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();


    }


}
