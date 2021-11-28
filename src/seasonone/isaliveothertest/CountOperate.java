package seasonone.isaliveothertest;

public class CountOperate extends Thread{

    public CountOperate(){
        System.out.println("CO---BEGIN");
        System.out.println("Current.getName()=="+Thread.currentThread().getName());
        System.out.println("Current.isAlive()=="+Thread.currentThread().isAlive());
        System.out.println("This.getName()=="+this.getName());
        System.out.println("This.getName()=="+this.isAlive());
        System.out.println("CO---END");
    }

    @Override
    public void run() {
        System.out.println("run---BEGIN");
        System.out.println("Current.getName()=="+Thread.currentThread().getName());
        System.out.println("Current.isAlive()=="+Thread.currentThread().isAlive());
        System.out.println("This.getName()=="+this.getName());
        System.out.println("This.isAlive()=="+this.isAlive());
        System.out.println("run---END");
    }

    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread t1 = new Thread(c);
        System.out.println("main begin t1 isAlive="+t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 isAlive="+t1.isAlive());

    }
}
