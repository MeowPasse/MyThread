package seasonone.t18;

public class MyThread2 extends Thread{

    @Override
    public void run() {
        System.out.println("t2 run priority="+ this.getPriority());
    }

}
