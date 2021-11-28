package seasonone.t15;

public class MyThread extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            for(int i=0;i<100000;i++){
                System.out.println("i="+(i+1));
            }
            System.out.println("run begin");

            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("��ֹͣ ��������sleep ����catch");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyThread my = new MyThread();
        my.start();
        my.interrupt();
        my.stop();
        System.out.println("end!");
    }
}
