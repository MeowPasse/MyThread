package seasontwo.part2.synBlockString2;

public class Service {

    private String anyString = new String();

    public void a() {
        try {
            synchronized (anyString) {
                System.out.println("A Begin");
                Thread.sleep(3000);
                System.out.println("A End");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void b(){
        System.out.println("B Begin");
        System.out.println("B End");
    }
}