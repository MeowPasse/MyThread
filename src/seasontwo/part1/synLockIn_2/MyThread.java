package seasontwo.part1.synLockIn_2;

public class MyThread extends Thread{

    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
    //�������� ���ڼ̳й�ϵ �����ͨ�������������ø����ͬ������
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
