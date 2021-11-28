package seasontwo.part1.throwExceptionNoLock;

public class ThreadB extends Thread {

    private Service s;

    public ThreadB(Service s){
        this.s = s;
    }

    @Override
    public void run() {
        super.run();
        s.testMethod();
    }
}
