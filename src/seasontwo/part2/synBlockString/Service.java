package seasontwo.part2.synBlockString;

public class Service {

    private String usernameParam;
    private String passwordParam;
    private String anyString = new String();

    public void setUsernamePassword(String username, String password) {
        try {
            String anyString = new String();//syn����Ϊ��this��������첽����
            synchronized (anyString) {
                System.out.println("�߳�����Ϊ:" + Thread.currentThread().getName() + " �� " + System.currentTimeMillis()
                        + "����ͬ����");
                usernameParam = username;
                Thread.sleep(3000);
                passwordParam = password;
                System.out.println("�߳�����Ϊ:" + Thread.currentThread().getName() + " �� " + System.currentTimeMillis()
                        + "�뿪ͬ����");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}