package lesson9;

class MyException15 extends Exception {
	 private static final long serialVersionUID = 1L;
	
	  public MyException15(String msg) {
	    super(msg);
	    System.out.println("\nMyException15 class message\n");
	  }
	  public MyException15() {  }
	  }
public class ApplMyException {
	static void doSomthing(int n) throws MyException15 {
		if (n > 0) {
			int a = 100 / n;
			System.out.println("a = " + a);
		} else throw new MyException15("\ninput value is below zero! \n");
	}
	public static void main(String[] args) throws MyException15  {
		try {
			//doSomthing(5); // a = 20
			doSomthing(-5); // exception
		} catch (MyException15 e1) {
			System.err.print(e1);
			//e1.printStackTrace();
			System.out.println("main Exception message");
		}
		System.out.println("main done");
	}
}
