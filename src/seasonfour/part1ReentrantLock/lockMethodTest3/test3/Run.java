package seasonfour.part1ReentrantLock.lockMethodTest3.test3;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		final Service service1 = new Service(true);
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				service1.serviceMethod();
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
