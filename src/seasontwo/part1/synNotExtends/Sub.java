package seasontwo.part1.synNotExtends;

public class Sub extends Main {

    @Override
    public void serviceMethod(){
        try{
            System.out.println("int main ��һ�� sleep begin threadName="+Thread.currentThread().getName()+
                    " time= "+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int main ��һ�� sleep end threadName="+Thread.currentThread().getName()+
                    " time= "+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //ͬ�����ܼ̳� ��Ҫ��synchronized
    public static void main(String[] args) {
        Sub s = new Sub();
        ThreadA a = new ThreadA(s);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(s);
        b.setName("B");
        b.start();
    }
}
