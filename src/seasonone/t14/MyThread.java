package seasonone.t14;
// 在sleep状态下停止某一线程 会进入catch语句 并清除停止状态 变为false
public class MyThread extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("沉睡中被停止，进入catch "+this.isInterrupted());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            MyThread my = new MyThread();
            my.start();
            Thread.sleep(200);
            my.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
