package seasontwo.part1.synchronizedMethodLockObject;


public class ThreadA extends Thread {

    private MyObject object;

    public ThreadA(MyObject object){
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
