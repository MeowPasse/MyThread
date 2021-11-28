package seasonthree.part1.wait_notify_size5;


public class Run {
//notify后并不直接释放锁
	public static void main(String[] args) {

		try {
			Object lock = new Object();

			ThreadA a = new ThreadA(lock);
			a.start();

			ThreadA c = new ThreadA(lock);
			c.start();

			Thread.sleep(50);

			ThreadB b = new ThreadB(lock);
			b.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
