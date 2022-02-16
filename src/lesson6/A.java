package lesson6;

public class A {
	public int i;
	private int k = 111;

	public A() {
		System.out.println("Class A: Constructor, k = " + k);
		k = 123;
		//System.out.println("k = "+ k);
		}
	public A(int i) {
		this.i = i;
		System.out.println("Class A: Constructor");
		//System.out.println("i = "+ i);
	}
		public int getK() {
		System.out.println("Class A: getK()");
		return k;
	}
	public void m1( ) {
		int temp;
		i=i+1;
		System.out.println("Class A: m1()");//+"i="+i
	}
	public static void m2( ) {
		System.out.println("Class A: m2()");
	}
	public void m3( ) {
		System.out.println("Class A: m3()");
	}
	
	/*
	protected static void m11(A a) {
		System.out.println("Class A: m11()");
	}
	public void m12( ) {
		System.out.println("Class A: m12()");
	}
	*/
}
