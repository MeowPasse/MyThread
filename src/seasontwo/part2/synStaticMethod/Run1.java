package seasontwo.part2.synStaticMethod;


public class Run1 {
    //syn�����ھ�̬������ ���Ե�ǰ.java�ļ���Ӧ��Class����г���
    public static void main(String[] args) throws InterruptedException {
        ThreadA a = new ThreadA();
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB();
        b.setName("b");
        b.start();
    }

}
