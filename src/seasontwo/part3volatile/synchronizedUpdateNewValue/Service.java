package seasontwo.part3volatile.synchronizedUpdateNewValue;

public class Service {

	private boolean isContinueRun = true;

	public void runMethod() {
		String anyString = new String();
		while (isContinueRun == true) {
			/*synchronized (anyString) {
			}*/
		}
		System.out.println("Õ£œ¬¿¥¡À£°");
	}

	public void stopMethod() {
		isContinueRun = false;
	}
}
