package lesson10.threads;

class Run1p implements Runnable {
	public void run() {
		int k;
		System.out.println("+ Thread ID = " + Thread.currentThread().getId());
		for (int i = 0; i < 100; i++) {
			/*-*/
			k = TwoThreadsAppl.sum;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			TwoThreadsAppl.sum = k + 1;
			System.out.print("+");
			
			/*
			synchronized (TwoThreadsAppl.monitor) {
				k = TwoThreadsAppl.sum;
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				TwoThreadsAppl.sum = k + 1;
				System.out.print("+");
				
				}
			*/
		}

		System.out.println("DONE+, sum = " + TwoThreadsAppl.sum);
	}
}
class Run1m implements Runnable {
	public void run() {
		int k;
		System.out.println("- Thread ID = " + Thread.currentThread().getId());
		for (int i = 0; i < 100; i++) {
		//	TwoThreadsAppl.go(Thread.currentThread().getId());
			/*-*/
			k = TwoThreadsAppl.sum;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			TwoThreadsAppl.sum = k - 1;
			System.out.print("-");
			
			/*-
			synchronized (TwoThreadsAppl.monitor) {
				k = TwoThreadsAppl.sum;
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				TwoThreadsAppl.sum = k - 1;
				System.out.print("-");
				
			}	
			*/
		}
		System.out.println("DONE-, sum = " + TwoThreadsAppl.sum);
	}
}
public class TwoThreadsAppl {
	public static int sum = 0;
	public static Object monitor = new Object();

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread ID = " + Thread.currentThread().getId());
		Runnable r1 = new Run1p();
		Thread t1 = new Thread(r1);
		Runnable r2 = new Run1m();
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
//		t1.join();
//		t2.join();
//		for (int i = 0; i < 1050; i++) {
//			Thread.yield();
//		}
		System.out.println("Main DONE, sum = " + sum);
	}
	public static void go(long id) {
		synchronized (monitor) {
			System.out.println("Current ID = " + id);
		}
	}
}
