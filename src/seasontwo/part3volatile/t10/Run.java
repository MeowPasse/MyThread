package seasontwo.part3volatile.t10;
//��-server������ģʽ��64bit��JVM�ϻ������ѭ��
public class Run {

	public static void main(String[] args) {
		PrintString printStringService = new PrintString();
		new Thread(printStringService).start();

		System.out.println("��Ҫֹͣ����stopThread="
				+ Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}

}
