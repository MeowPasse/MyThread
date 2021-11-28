package seasontwo.part3volatile.atomicIntergerNoSafe;

import java.util.concurrent.atomic.AtomicLong;
//方法和方法之间调用不是原子的
public class MyService {

	public static AtomicLong aiRef = new AtomicLong();

	synchronized public void addNum() {
		System.out.println(Thread.currentThread().getName() + "加了100之后的值是:"
				+ aiRef.addAndGet(100));
		aiRef.addAndGet(1);
	}

}
