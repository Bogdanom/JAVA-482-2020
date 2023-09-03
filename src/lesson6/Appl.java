package lesson6;

public class Appl {

	public static void main(String[] args) {
		
		//B.m2(); //from B, m2 static
		
		//B b = new B();
		//b.m1(); //from B, m1 public
				
		A b = new B();
		System.out.println("b.getK() = " + b.getK()); // b.getK() from A, public getK()
		
		b.m1(); //from B, m1 public
		//b.m2();//from A, but angry, m2 static
		
		// B b = new A(); = compile ERROR!!!!	
		
		//A a1 = new A();
		//B b = a1; = ERROR!!!!
		//B b = (B) a1; No compile ERROR, but Runtime ERROR!!!!
		
		//A.m2();//from A, m2() static
		//A.m1();// COMPILE ERROR, m1() public
		
		//A a = new A();
        //a.m1(); //from A,m1() public
		
//		A a = new B();
//		a.m1(); //from B, m1 public
//		((A) a).m1();//from B, m1 public
		
		// A a = new B();
		//a.m2(); // WARNING, but run from A, m2() static
		//a.m2(); // DON'T WORK if m2() static exist in B only
		//a.m4(); // DON'T WORK if m4() public exist in B only
		//((B)a).m4(); //run from B, m4 public exist in B only
		//A.m2(); //run from A, m2() static
	    //B.m2(); //run from B, m2() static
		//B.m2(); //run from A, if m2() static exist in A only
		
	//	A a = new B();
  //a.m1();//in B.m1 keyword super.m1(), run public m1 from B first, after public m1 from A
  // a.m1(); //in B.m1 keyword m2(), run public m1 from B first, after static m2 from B
  //a.m1();//in B.m1 keyword m2(exist in A only), run pub m1 from B, after static m2 from A
			
		
		/*
		int l=2;
		double d = -1.1;
		l=(int)d;
		System.out.println("l = " + l);
		*/
	}

}
