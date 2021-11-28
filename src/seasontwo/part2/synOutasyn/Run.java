package seasontwo.part2.synOutasyn;

public class Run {
    //执行退出成对出现 但线程A B异步执行 可能出现脏读
    public static void main(String[] args) {
        MyList list = new MyList();
        ThreadA a = new ThreadA(list);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(list);
        b.setName("b");
        b.start();
    }

}
