package seasontwo.part1.synchronizedMethodLockObject2;

public class MyObject {

    synchronized public void methodA(){
        try{
            System.out.println("begin A threadName="+Thread.currentThread().getName()
                    + " begin time ="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void methodB(){
        try{
            System.out.println("begin B threadName="+Thread.currentThread().getName()
            + " begin time ="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        a.setName("A");
        ThreadB b = new ThreadB(object);
        b.setName("B");
        a.start();
        b.start();
    }
}
