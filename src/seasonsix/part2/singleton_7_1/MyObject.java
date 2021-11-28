package seasonsix.part2.singleton_7_1;

import java.io.ObjectStreamException;
import java.io.Serial;
import java.io.Serializable;

public class MyObject implements Serializable{


	@Serial
	private static final long serialVersionUID = 8768616801134853422L;

	private static class MyObjectHandler{
		private static MyObject myObject = new MyObject();
	}

	private MyObject() {
	}
//静态内置类
	public static MyObject getInstance() {
		return MyObjectHandler.myObject;
	}

	protected Object readResolve() {
		System.out.println("调用了readResolve");
		return MyObjectHandler.myObject;
	}

}
