package seasonone.test;

import seasonone.MyThread;

public class MyThreadTest {

    public static void main(String[] args) {
        MyThread my = new MyThread();
        my.start();
        //my.start();
        System.out.println("finish");
    }

}
