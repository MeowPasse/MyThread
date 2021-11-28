package seasonone.t14;
// ��sleep״̬��ֹͣĳһ�߳� �����catch��� �����ֹͣ״̬ ��Ϊfalse
public class MyThread extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("��˯�б�ֹͣ������catch "+this.isInterrupted());
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
