package seasonone.t6;

public class Run1 extends Thread{

    public Run1(){
        System.out.println("���췽����ӡ:"+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        super.run();
        System.out.println("run������ӡ:"+Thread.currentThread().getName());

    }

    public static void main(String[] args) {
        Run1 run = new Run1();
        run.start();
        run.run();
    }
}
