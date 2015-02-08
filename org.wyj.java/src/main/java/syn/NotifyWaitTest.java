package syn;

public class NotifyWaitTest {
	
	public static Class lock = NotifyWaitTest.class;

	public static void main(String[] args) throws Exception {
		// new TestThread1().start();
		// new TestThread1().start();
		new TestThread2().start();
		new TestThread2().start();

		Thread.sleep(3000);
		// NotifyWaitTest.lock.notifyAll(); //# poing 1
		synchronized (NotifyWaitTest.lock) {
			try {
				System.out.println(Thread.currentThread().getName() + " sent notification all");
				NotifyWaitTest.lock.notify();

				// System.out.println(Thread.currentThread().getName() +
				// " sent notification 1");
				// NotifyWaitTest.lock.notify();
				// System.out.println(Thread.currentThread().getName() +
				// " sent notification 2");
				// Thread.sleep(3000);
				// NotifyWaitTest.lock.notify();
				// System.out.println(Thread.currentThread().getName() +
				// " sent notification over");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
