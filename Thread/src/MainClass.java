

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class MainClass {

    public static void main(String[] args) {

        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(3, true);
        Producer producerPut = new Producer(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);
        ProducerOffer producerOffer = new ProducerOffer(blockingQueue);


        new Thread(producerOffer).start();
        for (int i = 0; i < 10000; i++) {
            int a = i * 2312 / 234 * 12;
        }
        new Thread(consumer).start();


    }
}