package seasontwo.part2.setNewStringTwoLock;

//Bȡ������Ϊ456
public class Run1 {

	public static void main(String[] args) throws InterruptedException {

		MyService service = new MyService();

		ThreadA a = new ThreadA(service);
		a.setName("A");

		ThreadB b = new ThreadB(service);
		b.setName("B");

		a.start();
		Thread.sleep(50);// ����50����
		b.start();
	}
}
