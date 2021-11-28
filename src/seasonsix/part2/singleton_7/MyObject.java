package seasonsix.part2.singleton_7;

public class MyObject {


	private static class MyObjectHandler{
		private static MyObject myObject = new MyObject();
	}

	private MyObject() {
	}
//静态内置类
	public static MyObject getInstance() {
		return MyObjectHandler.myObject;
	}

}
