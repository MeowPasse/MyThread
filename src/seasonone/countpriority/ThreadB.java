package seasonone.countpriority;

public class ThreadB extends Thread{

    private int count = 0;

    public int getCount(){
        return count;
    }

    @Override
    public void run() {
        while(true){
            count++;
        }
    }

    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.setPriority(Thread.NORM_PRIORITY-3);
        a.start();
        ThreadB b = new ThreadB();
        b.setPriority(Thread.NORM_PRIORITY+3);
        b.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a.stop();
        b.stop();
        System.out.println("a="+a.getCount());
        System.out.println("b="+b.getCount());
    }
}
