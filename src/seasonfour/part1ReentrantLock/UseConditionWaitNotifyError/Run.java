package seasonfour.part1ReentrantLock.UseConditionWaitNotifyError;

//condition错误用法 必须在condition.await之前调用lock.lock方法
public class Run {

	public static void main(String[] args) {

		MyService service = new MyService();

		ThreadA a = new ThreadA(service);
		a.start();

	}

}
