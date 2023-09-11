package lesson10.threads;
/*- Run three threads for 5 times. The third thread supposed to start 
 * after finishing working of the two previous threads.
 */
public class HW_10_1_Supposed_3_thread {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Main Thread ID = " + Thread.currentThread().getId());
		Runnable r1 = new HW_10_1_Run_1();
		Thread t1 = new Thread(r1);
		Runnable r2 = new HW_10_1_Run_2();
		Thread t2 = new Thread(r2);
		Runnable r3 = new HW_10_1_Run_3();
		Thread t3 = new Thread(r3);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		t3.start();

		System.out.println("Main DONE, the END ");
	}
}
class HW_10_1_Run_1 implements Runnable {

	public void run() {

		System.out.println("Thread 1 START " + Thread.currentThread().getId());
		for (int i = 0; i < 5; i++) {

			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread 1 working");
		}
		System.out.println("Thread 1 FINISH");
	}
}
class HW_10_1_Run_2 implements Runnable {

	public void run() {
		System.out.println("Thread 2 START " + Thread.currentThread().getId());
		for (int i = 0; i < 5; i++) {

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread 2 working");
		}
		System.out.println("Thread 2 FINISH");

	}
}
class HW_10_1_Run_3 implements Runnable {
	public void run() {

		System.out.println("Thread 3 START " + Thread.currentThread().getId());
		for (int i = 0; i < 5; i++) {

			System.out.println("Thread 3 working");
		}
		System.out.println("Thread 3 FINISH");
	}
}