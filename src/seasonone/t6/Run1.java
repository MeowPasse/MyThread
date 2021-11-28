package seasonone.t6;

public class Run1 extends Thread{

    public Run1(){
        System.out.println("构造方法打印:"+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        super.run();
        System.out.println("run方法打印:"+Thread.currentThread().getName());

    }

    public static void main(String[] args) {
        Run1 run = new Run1();
        run.start();
        run.run();
    }
}
