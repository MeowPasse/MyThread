package seasonfour.part1ReentrantLock.z3_ok;

//只打印A 进入waiting状态
public class Run {

	public static void main(String[] args) {
		MyService myService = new MyService();
		MyThreadA a = new MyThreadA(myService);
		a.start();
	}
}
