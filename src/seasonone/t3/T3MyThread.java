package seasonone.t3;

import seasonone.MyThread;

///��������������
public class T3MyThread extends Thread{

    private int count = 5;

    public T3MyThread(){
        super();
    }

    public T3MyThread(String name){
        super();
        this.setName(name);
    }
    @Override
    public void run() {
        super.run();
//            try {
//                Thread.sleep(count*1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            count -- ;
            System.out.println("��"+this.currentThread().getName() + "���㣬count="+count);

    }

    public static void runUn(){
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
        runUn();


    }
}


