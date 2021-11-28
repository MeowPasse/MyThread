package seasontwo.part1.synNotExtends;

public class Sub extends Main {

    @Override
    public void serviceMethod(){
        try{
            System.out.println("int main 下一步 sleep begin threadName="+Thread.currentThread().getName()+
                    " time= "+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int main 下一步 sleep end threadName="+Thread.currentThread().getName()+
                    " time= "+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //同步不能继承 需要加synchronized
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
