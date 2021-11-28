package seasonseven.part2.groupAddThreadMoreLevel;

public class Run {

	public static void main(String[] args) {

		// main中添加线程组A 在A中加Z
		// 方法activeGroupCount activeCount 值不固定
		// 是系统环境中的一个快照
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		ThreadGroup group = new ThreadGroup(mainGroup, "A");
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					System.out.println("runMethod!");
					Thread.sleep(10000);// 线程必须在运行状态下才可以受组管理
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread newThread = new Thread(group, runnable);
		newThread.setName("Z");
		newThread.start();// 线程必须启动后才归到A组
		// ///
		ThreadGroup[] listGroup = new ThreadGroup[Thread.currentThread()
				.getThreadGroup().activeGroupCount()];
		Thread.currentThread().getThreadGroup().enumerate(listGroup);
		System.out.println("main中有多少线程组:" + listGroup.length + " 名字为:"
				+ listGroup[0].getName());
		Thread[] listThread = new Thread[listGroup[0].activeCount()];
		listGroup[0].enumerate(listThread);
		System.out.println(listThread[0].getName());

	}

}
