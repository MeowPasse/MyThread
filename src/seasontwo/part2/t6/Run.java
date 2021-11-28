package seasontwo.part2.t6;

public class Run {
    //同步代码块方式解决同步方法的弊端
    public static void main(String[] args) {
        Task task = new Task();
        Thread1 thread1 = new Thread1(task);
        thread1.start();
        Thread2 thread2 = new Thread2(task);
        thread2.start();
        try{
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long beginTime = CommonUtils.beginTime1;
        if (CommonUtils.beginTime2< CommonUtils.beginTime1){
            beginTime = CommonUtils.beginTime2;
        }
        long endTime = CommonUtils.endTime1;
        if(CommonUtils.endTime2> CommonUtils.endTime1){
                endTime = CommonUtils.endTime2;
        }
        System.out.println("耗时 : "+((endTime-beginTime)/1000));
    }

}
