package seasontwo.part3volatile.atomicIntergerNoSafe;

import java.util.concurrent.atomic.AtomicLong;
//�����ͷ���֮����ò���ԭ�ӵ�
public class MyService {

	public static AtomicLong aiRef = new AtomicLong();

	synchronized public void addNum() {
		System.out.println(Thread.currentThread().getName() + "����100֮���ֵ��:"
				+ aiRef.addAndGet(100));
		aiRef.addAndGet(1);
	}

}
