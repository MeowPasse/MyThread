package seasontwo.part3volatile.t16;

/* private boolean isRunning = true; �����ڹ�����ջ�Լ��̵߳�˽�ж�ջ�� JVM����Ϊ
   -server Ϊ��Ч�� �߳�һֱ��˽�ж�ջ��ȡ�� isRunning��ֵ��true ;set(false)��Ȼ��ִ�У�
   ���µ��ǹ�����ջ�е�isRunning����ֵfalse;ʹ��volatile����������
 */
public class Run {
	public static void main(String[] args) {
		try {
			RunThread thread = new RunThread();
			thread.start();
			Thread.sleep(1000);
			thread.setRunning(false);
			System.out.println("�Ѿ���ֵΪfalse");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
