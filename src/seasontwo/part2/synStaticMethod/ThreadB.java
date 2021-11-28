package seasontwo.part2.synStaticMethod;

public class ThreadB extends Thread{

    public ThreadB(){
        super();
    }
    @Override
    public void run() {
        super.run();
        Service.printB();
    }
}
