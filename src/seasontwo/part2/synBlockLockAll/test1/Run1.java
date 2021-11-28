package seasontwo.part2.synBlockLockAll.test1;


public class Run1 {
    //验证第一个结论 多个线程同时执行syn(x){} 同步代码块呈同步效果
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
