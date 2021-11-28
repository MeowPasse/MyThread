package seasonone.t11;

public class MyThread extends Thread{

    @Override
    public void run() {
        try{
            for(int i=0;i<200000;i++){
                if(this.interrupted()){
                    System.out.println("Í£Ö¹×´Ì¬ ÍË³ö");
                    throw new InterruptedException();
                }
                System.out.println("i="+(i+1));
            }
            System.out.println("¼ÌÐøÖ´ÐÐ");
        }catch (InterruptedException e){
            System.out.println("½øÈëcatch");
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        try {
            MyThread my = new MyThread();
            my.start();
            Thread.sleep(1000);

            my.interrupt();
            System.out.println("1=="+my.interrupted());
            System.out.println("2=="+my.interrupted());
            Thread.currentThread().interrupt();
            System.out.println("ÊÇ·ñÍ£Ö¹1?="+Thread.interrupted());//ÅÐ¶ÏÏß³ÌÊÇ·ñÎªÖÐ¶Ï×´Ì¬ ²¢Çå¿Õ×´Ì¬ÖÃÎªfalse
            System.out.println("ÊÇ·ñÍ£Ö¹2?="+Thread.interrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}

class Run3 {

    public static void main(String[] args) {
        try{
            MyThread my = new MyThread();my.start();
            Thread
            .sleep(1000);
            my.interrupt();
            System.out.println("Í£Ö¹1?"+my.isInterrupted());
            System.out.println("Í£Ö¹2?"+my.isInterrupted());


        } catch (InterruptedException e){

        }

    }

}
