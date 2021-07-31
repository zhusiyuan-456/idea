public class TaskClass implements Runnable {
    public TaskClass(){

    }
    @Override
    public void run(){}
}
class great{
    public void hello(){
        TaskClass task=new TaskClass();
        Thread thread=new Thread(task);
        thread.run();
    }
}
