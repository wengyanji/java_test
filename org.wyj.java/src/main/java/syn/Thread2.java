package syn;

import java.util.concurrent.locks.Lock;

class Thread2 implements Runnable {
	Lock lock;

	public Thread2(Lock lock) {
		this.lock = lock;
	}

	public void run() {
		// do something don't need lock
		lock.lock();
		System.out.println("Thread2 lock content is executing...");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		System.out.println("Thread2 is runned!!!");
	}

}
