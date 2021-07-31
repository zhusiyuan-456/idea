public class ThreadTest extends Thread {
    public static int test = 10000;

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 20000; i++)
                test++;
            System.out.println(test);
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 20000; i++)
                test--;
            System.out.println(test);
        });

            thread1.start();
            thread2.start();


    }
}
