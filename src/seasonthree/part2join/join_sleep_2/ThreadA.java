package seasonthree.part2join.join_sleep_2;

public class ThreadA extends Thread {

	private ThreadB b;

	public ThreadA(ThreadB b) {
		super();
		this.b = b;
	}

	@Override
	public void run() {
		try {
			synchronized (b) {
				b.start();
				b.join();
				// b.join() Õ∑≈À¯£°
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
