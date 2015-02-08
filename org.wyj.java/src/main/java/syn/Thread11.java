package syn;

import java.util.concurrent.locks.ReadWriteLock;

class Thread11 implements Runnable {
	ReadWriteLock lock;

	public Thread11(ReadWriteLock lock) {
		this.lock = lock;
	}

	public void run() {
		// do something don't need lock
		lock.writeLock().lock();
		System.out.println("Thread1 lock content is executing...");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {

			lock.writeLock().unlock();
		}
		System.out.println("Thread1 is runned!!!");
	}
}
