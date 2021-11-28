package seasonfour.part1ReentrantLock.UseConditionWaitNotifyOK;

//await=wait signal=notify signalAll=notifyAll
public class Run {

	public static void main(String[] args) throws InterruptedException {

		MyService service = new MyService();

		ThreadA a = new ThreadA(service);
		a.start();

		Thread.sleep(3000);

		service.signal();

	}

}
