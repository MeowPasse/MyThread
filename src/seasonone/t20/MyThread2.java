package seasonone.t20;

import java.util.Random;

public class MyThread2 extends  Thread {

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
        System.out.println("¡î ¡î ¡î ¡î ¡î t2 use "+ (endTime-beginTime));
    }

    public static void main(String[] args) {
       for (int i =0;i<5;i++){
           MyThread1 t1 = new MyThread1();
           t1.setPriority(5);
           t1.start();
           MyThread2 t2 = new MyThread2();
           t2.setPriority(6);
           t2.start();
       }
    }
}
