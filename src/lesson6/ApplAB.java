package lesson6;

public class ApplAB {

	public static void main(String[] args) {
		System.out.println("The Start.");
		System.out.println("Test ClassA.");
		ClassA a;
		a = new ClassA();
		System.out.println("a.i = " + a.i);
		a.m1();
		a.m2();
		a.m3();
		a.m4();
		//
//		System.out.println("Test ClassB.");
//		ClassA b;
//		b = new ClassB();
//		System.out.println("b.i = " + b.i);
//		b.m1();// from B
//		b.m2();// from A
//		b.m3();// from A m4 from B
//		b.m4();// from B
//
//		ClassB b0 = new ClassB();
//		System.out.println("Test_0 ClassB.");
//		System.out.println("b0.i = " + b0.i);
//		b0.m1();
//		b0.m2();
//		b0.m3();
//		b0.m4();

	}

}
