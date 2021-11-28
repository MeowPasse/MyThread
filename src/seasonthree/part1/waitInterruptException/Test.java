package seasonthree.part1.waitInterruptException;
//线程呈wait()状态时 调用interrupt方法会出现interruptException 异常
public class Test {

	public static void main(String[] args) {

		try {
			Object lock = new Object();

			ThreadA a = new ThreadA(lock);
			a.start();

			Thread.sleep(5000);

			a.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
