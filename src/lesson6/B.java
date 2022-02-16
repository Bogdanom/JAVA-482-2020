package lesson6;

public class B extends A {
	public int j;

	public B() {
		//super(1);
		System.out.println("Class B: Constructor");
		j = 121;
		//System.out.println("j = "+ j);
	}
	public void m1() {
		System.out.println("Class B: m1()");
		 //super.m1();
		//m2(); //from B
	}
		public static void m2( ) {
		System.out.println("Class B: m2()");
		//!!!m1(); Compile error. Not run public from static
	}
	public void m4() {
		System.out.println("Class B: m4()");
	}
	public void m11() {
		System.out.println("Class B: m11()");
		super.m1();
	}
}
