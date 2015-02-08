package syn;

public class Test {
	
	public static final Object obj = new Object();

	public static void main(String[] args) {
		new Thread(new Produce()).start();
		new Thread(new Consumer()).start();
		new Thread(new Consumer2()).start();
	}
}
