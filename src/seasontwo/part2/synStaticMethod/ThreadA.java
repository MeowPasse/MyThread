package seasontwo.part2.synStaticMethod;

public class ThreadA extends Thread{

    public ThreadA(){
        super();
    }
    @Override
    public void run() {
        super.run();
        Service.printA();
    }
}
