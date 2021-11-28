package seasontwo.part2.synOutasyn;

public class ThreadA extends Thread{

    private MyList list;
    public ThreadA(MyList list){
        super();
        this.list = list;
    }
    @Override
    public void run() {
        super.run();
        for(int i=0;i<100;i++){
            list.add("ThreadA"+(i+1));
        }
    }
}
