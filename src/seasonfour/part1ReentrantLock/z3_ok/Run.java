package seasonfour.part1ReentrantLock.z3_ok;

//ֻ��ӡA ����waiting״̬
public class Run {

	public static void main(String[] args) {
		MyService myService = new MyService();
		MyThreadA a = new MyThreadA(myService);
		a.start();
	}
}
