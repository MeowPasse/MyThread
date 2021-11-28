package seasonone.t4.controller;

public class BLogin extends Thread{

    @Override
    public void run() {
        LoginServlet.doPost("b","bb");
    }
}
