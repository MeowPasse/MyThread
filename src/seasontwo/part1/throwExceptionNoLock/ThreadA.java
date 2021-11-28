package seasontwo.part1.throwExceptionNoLock;

import seasontwo.part1.t2.HasSelfPrivateNum;

public class ThreadA extends Thread {

    private Service s;

    public ThreadA(Service s){
        this.s = s;
    }

    @Override
    public void run() {
        super.run();
        s.testMethod();
    }
}
