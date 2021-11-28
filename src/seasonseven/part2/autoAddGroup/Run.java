package seasonseven.part2.autoAddGroup;

public class Run {
	public static void main(String[] args) {
		System.out.println("A处线程"+Thread.currentThread().getName()+" 所属线程组为："
				+Thread.currentThread().getThreadGroup().activeGroupCount());
		ThreadGroup group=new ThreadGroup("new group");
		System.out.println("B处线程"+Thread.currentThread().getName()+
				" 所属线程组为："+Thread.currentThread().getThreadGroup().activeGroupCount());
		ThreadGroup[] threadGroup=new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadGroup);
		for (int i = 0; i < threadGroup.length; i++) {
			System.out.println("第一个线程组的名称为:"+threadGroup[i].getName());
		}
	}
}
