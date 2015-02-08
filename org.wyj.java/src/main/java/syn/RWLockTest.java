package syn;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RWLockTest {
	public static void main(String[] args) {
		ReadWriteLock lock = new ReentrantReadWriteLock();
		new Thread(new Thread11(lock)).start();
		new Thread(new Thread12(lock)).start();
		new Thread(new Thread13(lock)).start();
	}
}
