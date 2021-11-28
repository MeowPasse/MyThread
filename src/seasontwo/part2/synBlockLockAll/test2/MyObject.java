package seasontwo.part2.synBlockLockAll.test2;

public class MyObject {

    synchronized public void speedPrintString(){
        System.out.println("speedPrintString_______ getLock time="+System.currentTimeMillis()+
                " run ThreadName="+Thread.currentThread().getName());
        System.out.println("--------------------");
        System.out.println("speedPrintString_______ releaseLock time="+System.currentTimeMillis()+
                " run ThreadName="+Thread.currentThread().getName());
    }

}
