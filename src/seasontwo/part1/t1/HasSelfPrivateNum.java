package seasontwo.part1.t1;

public class HasSelfPrivateNum {

    public void addI(String name){
        try {
            int num = 0;
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
