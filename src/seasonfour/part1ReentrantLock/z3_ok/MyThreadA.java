package seasonfour.part1ReentrantLock.z3_ok;


public class MyThreadA extends Thread {

	private MyService myService;

	public MyThreadA(MyService myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		myService.waitMethod();
	}

}
