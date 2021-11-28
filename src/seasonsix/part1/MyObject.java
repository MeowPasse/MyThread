package seasonsix.part1;

public class MyObject {

	// 饿汉模式
	private static MyObject myObject = new MyObject();

	private MyObject() {
	}

	public static MyObject getInstance() {
		return myObject;
	}

}
