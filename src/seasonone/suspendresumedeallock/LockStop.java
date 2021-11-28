package seasonone.suspendresumedeallock;


public class LockStop extends Thread{
    private long i=0;

    @Override
    public void run() {
        while(true){
            i++;
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        try {
            LockStop thread = new LockStop();
            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            System.out.println("main end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
