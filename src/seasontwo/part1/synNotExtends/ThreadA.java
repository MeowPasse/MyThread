package seasontwo.part1.synNotExtends;

public class ThreadA extends Thread {

    private Sub s;

    public ThreadA(Sub s){
        this.s = s;
    }

    @Override
    public void run() {
        super.run();
        s.serviceMethod();
    }
}
