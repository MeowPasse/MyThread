package seasontwo.part2.synBlockLockAll.test1;


public class Run1 {
    //��֤��һ������ ����߳�ͬʱִ��syn(x){} ͬ��������ͬ��Ч��
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(service,object);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service,object);
        b.setName("b");
        b.start();
    }

}
