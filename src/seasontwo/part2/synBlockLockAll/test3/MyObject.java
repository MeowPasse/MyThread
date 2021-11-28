package seasontwo.part2.synBlockLockAll.test3;

public class MyObject {

    public void speedPrintString(){
        synchronized(this){
            System.out.println("speedPrintString_______ getLock time="+System.currentTimeMillis()+
                    " run ThreadName="+Thread.currentThread().getName());
            System.out.println("--------------------");
            System.out.println("speedPrintString_______ releaseLock time="+System.currentTimeMillis()+
                    " run ThreadName="+Thread.currentThread().getName());
        }

    }

}
