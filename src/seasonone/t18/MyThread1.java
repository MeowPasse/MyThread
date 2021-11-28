package seasonone.t18;

public class MyThread1 extends  Thread {

    @Override
    public void run() {
        System.out.println("t1 run priority="+ this.getPriority());
        MyThread2 t2 = new MyThread2();
        t2.start();
    }

    public static void main(String[] args) {
        System.out.println("main thread begin priority="+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread end priority="+Thread.currentThread().getPriority());
        MyThread1 t1 = new MyThread1();
        t1.start();
    }
}
