package seasontwo.part2.synBlockString2;


public class Run {
    //��֤ [syn��this����X ͬ�������] ��ʽʱ ���в�ͬ�Ķ��������ʱ�첽��Ч��
    //�����������ͬ �������н��Ϊ�첽
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("b");
        b.start();
    }

}
