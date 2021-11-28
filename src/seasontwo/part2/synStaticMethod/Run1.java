package seasontwo.part2.synStaticMethod;


public class Run1 {
    //syn作用在静态方法上 则会对当前.java文件对应的Class类进行持锁
    public static void main(String[] args) throws InterruptedException {
        ThreadA a = new ThreadA();
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB();
        b.setName("b");
        b.start();
    }

}
