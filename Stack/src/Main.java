import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedListStack<Integer> list=new LinkedListStack<>();
        for (int i=0;i<5;i++) {
            list.push(i);
            System.out.println(list);
        }
        list.pop();
        System.out.println(list);


        int count=10000000;
        LinkedListStack<Integer> li=new LinkedListStack<>();
        double time1 = TestQueue(li,count);
        System.out.println("LinkedListStack time: "+time1+"s");
        arrayStack<Integer> arrayStack=new arrayStack<>();
        double time2 = TestQueue(arrayStack,count);
        System.out.println("arrayStack time: "+time2+"s");

    }
    private static double TestQueue(Stack<Integer> stack,int optCount){
        long StartTime =System.nanoTime();
        Random random=new Random();
        for (int i=0;i<optCount;i++)
            stack.push(random.nextInt(Integer.MAX_VALUE));
        for (int i=0;i<optCount;i++)
            stack.pop();
        long EndTime=System.nanoTime();
        return (EndTime-StartTime)/1000000000.0;
    }
}
