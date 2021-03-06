package seasonfour.part1ReentrantLock.ReadWriteLockBegin3;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {

	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

	public void read() {
		try {
			try {
				lock.readLock().lock();
				System.out.println("获得读锁" + Thread.currentThread().getName()
						+ " " + System.currentTimeMillis());
				Thread.sleep(10000);
			} finally {
				lock.readLock().unlock();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void write(){
		try{
			try{
				lock.writeLock().lock();
				System.out.println("获得写锁"+Thread.currentThread().getName()+" "+System.currentTimeMillis());
				Thread.sleep(10000);
//				throw new InterruptedException();
			}finally {
				System.out.println("unlock");
				lock.writeLock().unlock();
			}
		}catch (InterruptedException e) {
			System.out.println("error");
			e.printStackTrace();
		}
	}

}
