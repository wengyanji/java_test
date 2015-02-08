package syn;

class TestThread1 extends Thread { 
    public void run() { 
        synchronized (NotifyWaitTest.lock) { 
            try { 
                System.out.println(Thread.currentThread().getName() + " wait for notification"); 
                NotifyWaitTest.lock.wait(); 
 
                System.out.println(Thread.currentThread().getName() + " wake up"); 
                for (int i = 0; i < 3; i++) { 
                    Thread.sleep(1000); 
                    System.out.println(Thread.currentThread().getName() + " doing " + i); 
                } 
            } catch (Exception e) { 
                e.printStackTrace(); 
            } 
            System.out.println(Thread.currentThread().getName() + " finished"); 
        } 
    } 
} 
