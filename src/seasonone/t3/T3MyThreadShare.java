package seasonone.t3;

///不共享数据例子
public class T3MyThreadShare extends Thread{

    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
//            try {
//                Thread.sleep(count*1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            count -- ;
            System.out.println("由"+this.currentThread().getName() + "计算，count="+count);

    }
//
    public static void runShare(){
        T3MyThreadShare my = new T3MyThreadShare();
        Thread b = new Thread(my,"B");
        Thread a = new Thread(my,"A");
        Thread c = new Thread(my,"C");
        Thread d = new Thread(my,"D");
        Thread e = new Thread(my,"E");

        b.start();
        c.start();
        d.start();
        e.start();
        a.start();
    }

    public static void main(String[] args) {
//        runUn();

        runShare();

    }
}


