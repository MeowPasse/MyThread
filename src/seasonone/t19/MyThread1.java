package seasonone.t19;

import java.util.Random;

public class MyThread1 extends  Thread {

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long addResult = 0;

        for (int j=0;j<10;j++){
            for (int i=0;i<50000;i++){
                Random random = new Random();
                random.nextInt();
                addResult = addResult + i;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("бя бя бя бя бя t1 use "+ (endTime-beginTime));
    }

    public static void main(String[] args) {
        System.out.println("main thread begin priority="+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread end priority="+Thread.currentThread().getPriority());
        MyThread1 t1 = new MyThread1();
        t1.start();
    }
}
