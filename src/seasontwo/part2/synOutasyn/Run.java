package seasontwo.part2.synOutasyn;

public class Run {
    //ִ���˳��ɶԳ��� ���߳�A B�첽ִ�� ���ܳ������
    public static void main(String[] args) {
        MyList list = new MyList();
        ThreadA a = new ThreadA(list);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(list);
        b.setName("b");
        b.start();
    }

}
