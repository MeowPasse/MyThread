package seasontwo.part2.synBlockLockAll.test1;

public class Service {

    public void testMethod1(MyObject object){
        synchronized (object){
            try{
                System.out.println("testMethod1 ___getLock time="
                +System.currentTimeMillis() + " run ThreadName="+
                        Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("testMethod1 releaseLock time="+
                        Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
