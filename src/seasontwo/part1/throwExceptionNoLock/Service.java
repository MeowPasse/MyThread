package seasontwo.part1.throwExceptionNoLock;

public class Service {

    synchronized public void testMethod(){
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("ThreadName="+Thread.currentThread().getName()
                    +"run beginTime="+System.currentTimeMillis());
            int i=1;
            while (i==1){
                if ((""+Math.random()).substring(0,8).equals("0.123456")){
                    System.out.println("ThreadName="+Thread.currentThread().getName()+
                            " run exceptionTime="+System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        }else{
            System.out.println("Thread B run Time="+System.currentTimeMillis());
        }
    }
    //a线程出现异常并释放锁 线程b进入方法正常打印
    public static void main(String[] args) {
        try {

            Service s = new Service();
            ThreadA a = new ThreadA(s);
            a.setName("a");
            a.start();
            Thread.sleep(500);
            ThreadB b = new ThreadB(s);
            b.setName("b");
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
