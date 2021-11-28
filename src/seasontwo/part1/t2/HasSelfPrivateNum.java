package seasontwo.part1.t2;

public class HasSelfPrivateNum {
    int num = 0;//共享 线程不安全 加synchronize解决
    synchronized public void addI(String name){
        try {
            if (name.equals("a")){
                num = 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            } else{
                num=200;
                System.out.println("b set over");
            }
            System.out.println(name+" num="+num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
