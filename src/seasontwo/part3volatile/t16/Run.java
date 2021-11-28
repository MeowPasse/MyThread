package seasontwo.part3volatile.t16;

/* private boolean isRunning = true; 存在于公共堆栈以及线程的私有堆栈中 JVM设置为
   -server 为了效率 线程一直在私有堆栈中取得 isRunning的值是true ;set(false)虽然被执行，
   更新的是公共堆栈中的isRunning变量值false;使用volatile解决这个问题
 */
public class Run {
	public static void main(String[] args) {
		try {
			RunThread thread = new RunThread();
			thread.start();
			Thread.sleep(1000);
			thread.setRunning(false);
			System.out.println("已经赋值为false");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
