package seasonone.t16;
//ʹ��returnֹͣ�߳� ���ǽ����׳��쳣��ʽ ʹ���¼����Դ���
public class MyThread extends Thread{

    @Override
    public void run() {
        while(true){
            if(this.isInterrupted()){
                System.out.println("ֹͣ");
                return;
            }
            System.out.println("timer="+System.currentTimeMillis());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
    }

}
