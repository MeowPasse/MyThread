package seasonsix.part2.singleton_2_2;

public class MyObject {

	private static MyObject myObject;

	private MyObject() {
	}

	public static MyObject getInstance() {
		try {
			synchronized (MyObject.class){
				if (myObject != null) {
				} else {
					// 模拟在创建对象前的一些准备工作
					//效率低 需要上锁
					Thread.sleep(3000);
					myObject = new MyObject();
				}
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}

}
