package seasonthree.part2join.joinTest2;

//ͨ��Joinʵ���߳̽�����ִ������Ĵ��� join���ڲ�ʹ��wait()�������еȴ� synʹ�ö��������ԭ����Ϊͬ��
public class Test {

	public static void main(String[] args) {
		try {
			MyThread threadTest = new MyThread();
			threadTest.start();
			threadTest.join();

			System.out.println("���뵱threadTest����ִ����Ϻ�����ִ�У���������");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
