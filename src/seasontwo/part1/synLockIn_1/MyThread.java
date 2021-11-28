package seasontwo.part1.synLockIn_1;

import seasontwo.part1.synchronizedMethodLockObject.MyObject;

public class MyThread extends Thread{

    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
    //ø…÷ÿ»ÎÀ¯
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
