package seasonthree.part1.stack_4;

//多生产多消费
public class Run {
	public static void main(String[] args) {
		MyStack myStack = new MyStack();

		P p1 = new P(myStack);
		P p2 = new P(myStack);
		P p3 = new P(myStack);
		P p4 = new P(myStack);
		P p5 = new P(myStack);
		P p6 = new P(myStack);
		C r1 = new C(myStack);
		C r2 = new C(myStack);
		C r3 = new C(myStack);
		C r4= new C(myStack);
		C r5 = new C(myStack);
		C r6 = new C(myStack);

		P_Thread pThread1 = new P_Thread(p1);
		P_Thread pThread2 = new P_Thread(p2);
		P_Thread pThread3 = new P_Thread(p3);
		P_Thread pThread4 = new P_Thread(p4);
		P_Thread pThread5 = new P_Thread(p5);
		P_Thread pThread6 = new P_Thread(p6);
		C_Thread rThread1 = new C_Thread(r1);
		C_Thread rThread2 = new C_Thread(r2);
		C_Thread rThread3 = new C_Thread(r3);
		C_Thread rThread4 = new C_Thread(r4);
		C_Thread rThread5 = new C_Thread(r5);
		C_Thread rThread6 = new C_Thread(r6);
		pThread1.start();
		pThread2.start();
		pThread3.start();
		pThread4.start();
		pThread5.start();
		pThread6.start();
		rThread1.start();
		rThread2.start();
		rThread3.start();
		rThread4.start();
		rThread5.start();
		rThread6.start();
	}

}
