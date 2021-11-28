package seasonthree.part1.TwoThreadTransData;
//需要不停while轮询来检测条件 浪费CPU资源
public class Test {

	public static void main(String[] args) {
		MyList service = new MyList();

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();

	}

}
