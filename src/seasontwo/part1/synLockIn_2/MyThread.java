package seasontwo.part1.synLockIn_2;

public class MyThread extends Thread{

    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
    //可重入锁 存在继承关系 子类可通过可重入锁调用父类的同步方法
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
