package seasontwo.part2.t8;

public class Run {
    //ͬ������鷽ʽ���ͬ�������ı׶�
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        Thread1 thread1 = new Thread1(task);
        thread1.start();
        Thread.sleep(100);
        Thread2 thread2 = new Thread2(task);
        thread2.start();
    }

}
