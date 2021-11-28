package seasonone.daemonThread;

public class MyThread extends Thread{

    private int i = 0;

    @Override
    public void run() {
        try{
            while(true){
                i++;
                System.out.println("i="+(i));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try{
            MyThread t = new MyThread();
            //设置为守护线程
//            t.setDaemon(true);
            t.start();
            Thread.sleep(5000);
            System.out.println("我离开thread对象也不打印了 也就是停止了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
