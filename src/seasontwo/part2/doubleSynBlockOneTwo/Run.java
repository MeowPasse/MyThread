package seasontwo.part2.doubleSynBlockOneTwo;

public class Run {
    //验证synchronized(this) 代码块是锁定当前对象的
    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        ThreadA a = new ThreadA(service);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("b");
        b.start();
    }

}
