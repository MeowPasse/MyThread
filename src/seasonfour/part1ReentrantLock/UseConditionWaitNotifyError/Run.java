package seasonfour.part1ReentrantLock.UseConditionWaitNotifyError;

//condition�����÷� ������condition.await֮ǰ����lock.lock����
public class Run {

	public static void main(String[] args) {

		MyService service = new MyService();

		ThreadA a = new ThreadA(service);
		a.start();

	}

}
