package seasonthree.part3ThreadLocal.ThreadLocal22;

public class ThreadLocalExt extends ThreadLocal {
	@Override
	protected Object initialValue() {
		return "����Ĭ��ֵ ��һ��get����Ϊnull";
	}
}
