package seasonseven.part2.getGroupParent;

public class Run {

	public static void main(String[] args) {
		System.out.println("线程:" + Thread.currentThread().getName()
				+ " 所在组:"
				+ Thread.currentThread().getThreadGroup().getName());
		System.out
				.println("main所在组的父线程"
						+ Thread.currentThread().getThreadGroup().getParent()
								.getName());
		System.out.println("main所在组的父线程组的父线程组"
				+ Thread.currentThread().getThreadGroup().getParent()
						.getParent().getName());
	}

}
