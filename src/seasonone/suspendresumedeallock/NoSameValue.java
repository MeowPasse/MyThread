package seasonone.suspendresumedeallock;


public class NoSameValue {
    private String username = "1";
    private String password = "11";

    public void setValue(String u,String p){
        this.username = u;
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("Í£Ö¹AÏß³Ì");
            Thread.currentThread().suspend();
        }
        this.password = p;
    }

    public void printUsernamePassword(){
        System.out.println(username+","+password);
    }

    public static void main(String[] args) throws InterruptedException {
        final NoSameValue noSameValue = new NoSameValue();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                noSameValue.setValue("a","aa");
            }
        };
        t1.setName("a");
        t1.start();
        Thread.sleep(500);
        Thread t2 = new Thread(){
            @Override
            public void run() {
                noSameValue.printUsernamePassword();
            }
        };
        t2.start();
    }
}
