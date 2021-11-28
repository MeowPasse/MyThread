package seasonone.t4.controller;

public class ALogin extends Thread{

    @Override
    public void run() {
        LoginServlet.doPost("a","aa");
    }
}
