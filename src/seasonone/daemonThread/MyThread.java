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
            //����Ϊ�ػ��߳�
//            t.setDaemon(true);
            t.start();
            Thread.sleep(5000);
            System.out.println("���뿪thread����Ҳ����ӡ�� Ҳ����ֹͣ��");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
