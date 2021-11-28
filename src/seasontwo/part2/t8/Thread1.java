package seasontwo.part2.t8;



public class Thread1 extends Thread{

    private Task task;
    public Thread1(Task task){
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
