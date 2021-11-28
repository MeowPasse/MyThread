package seasonsix.part2.singleton_3;

public class MyObject {

	private static MyObject myObject;

	private MyObject() {
	}

	public static MyObject getInstance() {
		try {
				if (myObject != null) {
				} else {
					// 模拟在创建对象前的一些准备工作
					//效率低 需要上锁
					Thread.sleep(3000);
					synchronized (MyObject.class){
						myObject = new MyObject();
					}
				}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}

}
