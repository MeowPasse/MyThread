package seasonthree.part1.p_c_allWait_fix;

//������
public class C {

	private String lock;

	public C(String lock) {
		super();
		this.lock = lock;
	}

	public void getValue() {
		try {
			synchronized (lock) {
				while (ValueObject.value.equals("")) {
					System.out.println("������ "
							+ Thread.currentThread().getName() + " WAITING�ˡ�");
					lock.wait();
				}
				System.out.println("������ " + Thread.currentThread().getName()
						+ " RUNNABLE��");
				ValueObject.value = "";
				lock.notify();
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
