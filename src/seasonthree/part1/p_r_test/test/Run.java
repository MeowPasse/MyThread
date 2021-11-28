package seasonthree.part1.p_r_test.test;


import seasonthree.part1.p_r_test.entity.C;
import seasonthree.part1.p_r_test.entity.P;
import seasonthree.part1.p_r_test.extthread.ThreadC;
import seasonthree.part1.p_r_test.extthread.ThreadP;

public class Run {

	public static void main(String[] args) {

		String lock = new String("");
		P p = new P(lock);
		C r = new C(lock);

		ThreadP pThread = new ThreadP(p);
		ThreadC rThread = new ThreadC(r);

		pThread.start();
		rThread.start();
	}

}
