package seasontwo.part2.t7;

public class Task {
    public void doLongTimeTask(){

        for(int i=0;i<50;i++){
            System.out.println("no synchronized threadName="+
                    Thread.currentThread().getName()+" i="+(i+1));

        }
        System.out.println("");
        synchronized (this){
            for (int i=0;i<50;i++){
                System.out.println("synchronized threadName="+
                Thread.currentThread().getName()+" i="+(i+1));
            }
        }

    }

}
