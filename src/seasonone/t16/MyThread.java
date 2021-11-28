package seasonone.t16;
//使用return停止线程 还是建议抛出异常方式 使得事件得以传播
public class MyThread extends Thread{

    @Override
    public void run() {
        while(true){
            if(this.isInterrupted()){
                System.out.println("停止");
                return;
            }
            System.out.println("timer="+System.currentTimeMillis());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
    }

}
