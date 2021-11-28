package seasontwo.part2.t9;


public class Run {
    //出现脏读 加上syn(list)解决 getSize也需要同步
    public static void main(String[] args) throws InterruptedException {
        MyOneList list = new MyOneList();
        Thread1 thread1 = new Thread1(list);
        thread1.setName("A");
        thread1.start();
        Thread2 thread2 = new Thread2(list);
        thread1.setName("B");
        thread2.start();
        Thread.sleep(6000);
        System.out.println("listSize="+list.getSize());
    }

}
