package seasonthree.part1.test1;
//û�ж�������� Ҳ����û��ͬ������
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
