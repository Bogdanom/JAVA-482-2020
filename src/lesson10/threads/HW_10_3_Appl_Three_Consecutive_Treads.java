package lesson10.threads;

public class HW_10_3_Appl_Three_Consecutive_Treads {
	public static void main(String[] args) throws InterruptedException {

		System.out.println("Main Thread ID = " + Thread.currentThread().getId());
		Runnable r1 = new HW_10_3_Run_One();
		Thread t1 = new Thread(r1);

		t1.start();

		System.out.println("Main DONE");
	}
}
class HW_10_3_Run_One implements Runnable {

	public void run() {

		System.out.println("Thread One START " + Thread.currentThread().getId());
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread One working");
		}

		Runnable r2 = new HW_10_3_Run_Two();
		Thread t2 = new Thread(r2);
		t2.start();
		System.out.println("Thread One FINISH");
	}
}
class HW_10_3_Run_Two implements Runnable {

	public void run() {
		System.out.println("Thread number Two START " + Thread.currentThread().getId());
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread Two working");
		}
		Runnable r3 = new HW_10_3_Run_Three();
		Thread t3 = new Thread(r3);
		t3.start();
		System.out.println("Thread Two FINISH");

	}
}
class HW_10_3_Run_Three implements Runnable {
	public void run() {

		System.out.println("Thread number Three START " + Thread.currentThread().getId());
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread number Three working");
		}
		System.out.println("Thread number Three FINISH");
		System.out.println("The END");
	}
}
