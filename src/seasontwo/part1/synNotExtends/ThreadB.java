package seasontwo.part1.synNotExtends;

public class ThreadB extends Thread {

    private Sub s;

    public ThreadB(Sub s){
        this.s = s;
    }

    @Override
    public void run() {
        super.run();
        s.serviceMethod();
    }
}
