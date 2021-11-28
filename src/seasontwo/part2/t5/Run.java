package seasontwo.part2.t5;

public class Run {

    public static void main(String[] args) {
        Task task = new Task();
        Thread1 thread1 = new Thread1(task);
        thread1.start();
        Thread2 thread2 = new Thread2(task);
        thread2.start();
        try{
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long beginTime = CommonUtils.beginTime1;
        if (CommonUtils.beginTime2<CommonUtils.beginTime1){
            beginTime = CommonUtils.beginTime2;
        }
        long endTime = CommonUtils.endTime1;
        if(CommonUtils.endTime2>CommonUtils.endTime1){
                endTime = CommonUtils.endTime2;
        }
        System.out.println("ºÄÊ± : "+((endTime-beginTime)/1000));
    }

}
