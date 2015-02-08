package syn;

class TestThread2 extends Thread { 
	 
    public void run() { 
        synchronized (NotifyWaitTest.lock) { 
            System.out.println(Thread.currentThread().getName() + " wait for notification"); 
            try { 
                NotifyWaitTest.lock.wait(); 
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            } 
        } 
        System.out.println(Thread.currentThread().getName() + " wake up"); 
        for (int i = 0; i < 3; i++) { 
            try { 
                Thread.sleep(1000); 
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            } 
            System.out.println(Thread.currentThread().getName() + " doing " + i); 
        } 
    } 
} 