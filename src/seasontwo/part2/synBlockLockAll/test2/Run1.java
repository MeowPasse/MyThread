package seasontwo.part2.synBlockLockAll.test2;

public class Run1 {
    //当其他线程执行X对象中的syn同步方法时呈同步效果
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(service,object);
        a.setName("a");
        a.start();
        Thread.sleep(100);
        ThreadB b = new ThreadB(object);
        b.setName("b");
        b.start();
    }

}
