package seasonthree.part1.TwoThreadTransData;
//��Ҫ��ͣwhile��ѯ��������� �˷�CPU��Դ
public class Test {

	public static void main(String[] args) {
		MyList service = new MyList();

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();

	}

}
