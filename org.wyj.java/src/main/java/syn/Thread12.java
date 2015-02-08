package syn;

import java.util.concurrent.locks.ReadWriteLock;

class Thread12 implements Runnable {
	ReadWriteLock lock;

	public Thread12(ReadWriteLock lock) {
		this.lock = lock;
	}

	public void run() {
		// do something don't need lock
		lock.readLock().lock();
		System.out.println("Thread2 lock content is executing...");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {

			lock.readLock().unlock();
		}
		System.out.println("Thread2 is runned!!!");
	}
}