package lesson10.threads;

public class HW_10_2_Deadlock {
	public final static Object first = new Object();
	public final static Object second = new Object();

	public static void main(String s[]) {
	   Thread t1 = new Thread() {
	   public void run() {
	      synchronized (first) {
	    	  System.out.println("Lock first1");
	         //Thread.yield();
	         try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	         synchronized (second) {
	        	 System.out.println("Lock seccond1");
	            System.out.println("Success1!");
	   }  }  }  };
	   Thread t2 = new Thread() {
		   public void run() {
		      synchronized (second) {
		    	  System.out.println("Lock seccond2");  
		    	  try {
		  			Thread.sleep(10);
		  		} catch (InterruptedException e) {
		  			// TODO Auto-generated catch block
		  			e.printStackTrace();
		  		}
		         synchronized (first) {
		            System.out.println("Success2!");
		            System.out.println("Lock first2");
		         }
		      }
		   }
		};
		t1.start();
		t2.start();
		System.out.println("main done!");
		}
		}

