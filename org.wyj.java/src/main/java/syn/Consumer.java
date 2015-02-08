package syn;

public class Consumer implements Runnable {

	public synchronized void run() {
		// TODO Auto-generated method stub
		int count = 10;
		while (count > 0) {
			synchronized (Test.obj) {

				System.out.print("B");
				count--;
				Test.obj.notify(); // 

				try {
					Test.obj.wait();

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}
}
