public class demo1 {
    public static void main(String[] args) {
      Thread t1=  new Thread(()->{
            System.out.println("hello");
            System.out.println("hello");
            System.out.println("hello");
      },"thread_1");
        Thread t2=new Thread(()->{
                System.out.println("jello");
                System.out.println("jello");
                System.out.println("jello");
        });
        Thread t3=new Thread(()->{
            System.out.println("pello");
            System.out.println("pello");
            System.out.println("pello");
        });
        Thread t4=new Thread(()->{
            for(int i=0;i<3;i++)
            System.out.println("kello");

        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
