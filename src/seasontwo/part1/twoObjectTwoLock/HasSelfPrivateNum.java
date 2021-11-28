package seasontwo.part1.twoObjectTwoLock;

public class HasSelfPrivateNum {
    int num = 0;//共享 线程不安全 加synchronize解决
    synchronized public void addI(String name){
        try {
            long start = System.currentTimeMillis();
            if (name.equals("a")){
                num = 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            } else{
                num=200;
                System.out.println("b set over");
            }
            long end = System.currentTimeMillis();
            System.out.println(name+" num="+num+" time:"+(end-start));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
