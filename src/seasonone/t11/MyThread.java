package seasonone.t11;

public class MyThread extends Thread{

    @Override
    public void run() {
        try{
            for(int i=0;i<200000;i++){
                if(this.interrupted()){
                    System.out.println("ֹͣ״̬ �˳�");
                    throw new InterruptedException();
                }
                System.out.println("i="+(i+1));
            }
            System.out.println("����ִ��");
        }catch (InterruptedException e){
            System.out.println("����catch");
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
            System.out.println("�Ƿ�ֹͣ1?="+Thread.interrupted());//�ж��߳��Ƿ�Ϊ�ж�״̬ �����״̬��Ϊfalse
            System.out.println("�Ƿ�ֹͣ2?="+Thread.interrupted());
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
            System.out.println("ֹͣ1?"+my.isInterrupted());
            System.out.println("ֹͣ2?"+my.isInterrupted());


        } catch (InterruptedException e){

        }

    }

}
