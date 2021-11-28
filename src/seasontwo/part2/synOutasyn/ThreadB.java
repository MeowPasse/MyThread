package seasontwo.part2.synOutasyn;

public class ThreadB extends Thread{

    private MyList list;
    public ThreadB(MyList list){
        super();
        this.list = list;
    }
    @Override
    public void run() {
        super.run();
        for(int i=0;i<100;i++){
            list.add("ThreadB"+(i+1));
        }
    }
}
