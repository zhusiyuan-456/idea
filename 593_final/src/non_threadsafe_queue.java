import java.util.ArrayList;
import java.util.List;

public class non_threadsafe_queue {
    private List<Integer> queue=new ArrayList<>();
    private int maxSize;
public non_threadsafe_queue(int maxSize){
    this.maxSize=maxSize;
}

    public void put(int element){
        queue.add(element);
    }

    public void take(){
        queue.remove(0);
        }


    public static void main(String[] args) {
        non_threadsafe_queue myBlockingQueue=new non_threadsafe_queue(5);
        new Thread(()->{
            myBlockingQueue.put(1);
//            myBlockingQueue.put(2);
//            myBlockingQueue.put(3);
//            myBlockingQueue.put(4);
//            myBlockingQueue.put(5);
//            myBlockingQueue.put(6);
//            myBlockingQueue.put(7);
//            myBlockingQueue.put(8);
//            myBlockingQueue.put(9);
//            myBlockingQueue.put(10);
//            myBlockingQueue.put(11);
//            myBlockingQueue.put(12);
//            myBlockingQueue.put(13);
//            myBlockingQueue.put(14);
//            myBlockingQueue.put(15);
//            myBlockingQueue.put(16);
//            myBlockingQueue.put(17);
//            myBlockingQueue.put(18);
//            myBlockingQueue.put(19);

        },"T1_put").start();
        new Thread(()->{
            myBlockingQueue.take();
            myBlockingQueue.take();
            myBlockingQueue.take();
            myBlockingQueue.take();
            myBlockingQueue.take();
            myBlockingQueue.take();
            myBlockingQueue.take();
            myBlockingQueue.take();
            myBlockingQueue.take();
            myBlockingQueue.take();
            myBlockingQueue.take();
            myBlockingQueue.take();
            myBlockingQueue.take();
        },"T2_take").start();
        //take 13 elements

//        new Thread(()->{
//            myBlockingQueue.put(4);
//            myBlockingQueue.put(5);
//            myBlockingQueue.put(6);
//            myBlockingQueue.put(7);
//            myBlockingQueue.put(8);
//            myBlockingQueue.put(9);
//            myBlockingQueue.put(10);
//            myBlockingQueue.put(11);
//        },"T3_put").start();
//
//        new Thread(()->{
//            myBlockingQueue.take();
//            myBlockingQueue.take();
//        },"T4_take").start();

    }
}

