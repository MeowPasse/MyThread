package seasontwo.part2.StringAndSyn;

public class ThreadB extends Thread {
	private Service service;
	public ThreadB(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.print(new String("AA"));
//		service.print("AA");
	}
}
