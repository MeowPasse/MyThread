package seasonthree.part1.stack_2_old;

//一生产多消费 条件发生改变时没有得到及时响应 多个wait线程被唤醒
public class Run {
	public static void main(String[] args) {
		MyStack myStack = new MyStack();

		P p = new P(myStack);
		C r1 = new C(myStack);
		C r2 = new C(myStack);
		C r3 = new C(myStack);
		C r4 = new C(myStack);
		C r5 = new C(myStack);

		P_Thread pThread = new P_Thread(p);
		C_Thread rThread1 = new C_Thread(r1);
		C_Thread rThread2 = new C_Thread(r2);
		C_Thread rThread3 = new C_Thread(r3);
		C_Thread rThread4 = new C_Thread(r4);
		C_Thread rThread5 = new C_Thread(r5);
		pThread.start();
		rThread1.start();
		rThread2.start();
		rThread3.start();
		rThread4.start();
		rThread5.start();
	}

}
