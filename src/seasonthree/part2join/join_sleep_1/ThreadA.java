package seasonthree.part2join.join_sleep_1;

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
				Thread.sleep(6000);
				// Thread.sleep()���ͷ�����
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
