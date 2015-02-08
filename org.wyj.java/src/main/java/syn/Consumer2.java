package syn;

public class Consumer2 implements Runnable {

	public synchronized void run() {
		// TODO Auto-generated method stub
		int count = 10;
		while (count > 0) {
			synchronized (Test.obj) {

				System.out.print("C");
				count--;
				Test.obj.notify(); // �����ͷŶ�����

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
