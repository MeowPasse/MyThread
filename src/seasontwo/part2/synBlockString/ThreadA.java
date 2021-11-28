package seasontwo.part2.synBlockString;



public class ThreadA extends Thread{

    private Service service;
    public ThreadA(Service service){
        super();
        this.service = service;
    }
    @Override
    public void run() {
        super.run();
        service.setUsernamePassword("a","aa");
    }
}
