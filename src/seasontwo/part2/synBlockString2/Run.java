package seasontwo.part2.synBlockString2;


public class Run {
    //验证 [syn非this对象X 同步代码块] 格式时 持有不同的对象监视器时异步的效果
    //对象监视器不同 所以运行结果为异步
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("b");
        b.start();
    }

}
