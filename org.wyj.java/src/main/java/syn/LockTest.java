package syn;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		new Thread(new Thread1(lock)).start();
		new Thread(new Thread2(lock)).start();
	}
}
