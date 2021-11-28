package seasontwo.part2.t6;

public class Thread2 extends Thread{

    private Task task;
    public Thread2(Task task){
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime2 = System.currentTimeMillis();
        System.out.println(CommonUtils.beginTime2);
        task.doLongTimeTask();
        CommonUtils.endTime2 = System.currentTimeMillis();
    }
}
