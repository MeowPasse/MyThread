package seasontwo.part1.t3;

public class ThreadA extends Thread{

    private PublicVar publicVar;
    public ThreadA(PublicVar publicVar){
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B","BB");
    }
    //脏读 解决 getValue也加 synchronized
    public static void main(String[] args) {
        try{
            PublicVar publicVar = new PublicVar();
            ThreadA a = new ThreadA(publicVar);
            a.start();
            Thread.sleep(200);
            publicVar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
