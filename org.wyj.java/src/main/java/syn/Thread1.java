package syn;

import java.util.concurrent.locks.Lock;

class Thread1 implements Runnable {
	Lock lock;

	public Thread1(Lock lock) {
		this.lock = lock;
	}

	public void run() {
		// do something don't need lock
		lock.lock();
		System.out.println("Thread1 lock content is executing...");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		System.out.println("Thread1 is runned!!!");
	}
}
