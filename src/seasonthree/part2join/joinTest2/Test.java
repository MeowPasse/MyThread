package seasonthree.part2join.joinTest2;

//通过Join实现线程结束后执行下面的代码 join在内部使用wait()方法进行等待 syn使用对象监视器原理作为同步
public class Test {

	public static void main(String[] args) {
		try {
			MyThread threadTest = new MyThread();
			threadTest.start();
			threadTest.join();

			System.out.println("我想当threadTest对象执行完毕后我再执行，我做到了");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
