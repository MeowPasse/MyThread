package seasontwo.part2.t9;


public class Thread1 extends Thread{

    private MyOneList list;
    public Thread1(MyOneList list){
        this.list = list;
    }

    @Override
    public void run() {
        MyService s = new MyService();
        s.addServiceMethod(list,"A");
    }
}
