package seasonthree.part1.test1;
//没有对象监视器 也就是没有同步加锁
public class Test1 {
	public static void main(String[] args) {
		try {
			String newString = new String("");
			newString.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
