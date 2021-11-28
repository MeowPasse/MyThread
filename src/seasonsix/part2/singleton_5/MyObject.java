package seasonsix.part2.singleton_5;

public class MyObject {

	private static MyObject myObject;

	private MyObject() {
	}
//使用双检测机制来解决问题 保证了不需要同步代码的异步执行性，又保证单例效果
	public static MyObject getInstance() {
		try {
				if (myObject != null) {
				} else {

					//效率低 需要上锁
					Thread.sleep(3000);
					synchronized (MyObject.class){
						if (myObject==null) {
							myObject = new MyObject();
						}
					}
				}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}

}
