package seasontwo.part2.t9;


public class Thread2 extends Thread{

    private MyOneList list;
    public Thread2(MyOneList list){
        this.list = list;
    }

    @Override
    public void run() {
        MyService s = new MyService();
        s.addServiceMethod(list,"B");
    }
}
