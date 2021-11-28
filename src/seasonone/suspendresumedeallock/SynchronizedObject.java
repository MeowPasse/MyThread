package seasonone.suspendresumedeallock;

public class SynchronizedObject {

    synchronized public void printString(){
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("a线程永远suspend了");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        try {
            final SynchronizedObject object = new SynchronizedObject();
            Thread t1 = new Thread(){
                @Override
                public void run() {
                    object.printString();
                }
            };

            t1.setName("a");
            t1.start();
            Thread.sleep(1000);
            Thread t2 = new Thread(){
                @Override
                public void run() {
                    System.out.println("t2启动了 但进不去printString,只打印一个begin");
                    System.out.println("因为printString被a锁定并永远suspend暂停");
                    object.printString();
                }
            };
            t2.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
