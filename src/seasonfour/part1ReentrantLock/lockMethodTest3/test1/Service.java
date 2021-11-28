package seasonfour.part1ReentrantLock.lockMethodTest3.test1;

import java.util.concurrent.locks.ReentrantLock;

public class Service {

	private ReentrantLock lock;

	public Service(boolean isFair) {
		super();
		lock = new ReentrantLock(isFair);
	}

	public void serviceMethod() {
		try {
			lock.lock();
			System.out.println(Thread.currentThread().getName()+ "公平锁情况：" + lock.isFair());
		} finally {
			lock.unlock();
		}
	}

}
