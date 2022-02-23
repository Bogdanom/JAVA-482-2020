package lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl_train {
	  
	  public int m1(int k)  {
		  if (k==2) {
			  throw new RuntimeException("HaHaHa"); 
		  }
		  try {
		  //Thread.sleep(100);
		int[] arr1= {11,12};
		System.out.println("m1() done! m1() = "+ arr1[k]/k);
		System.out.println("try done");
		return arr1[k]/k;
		  } 
		  catch (NumberFormatException e) {
				System.err.println("m1() non-format input");
		  }	catch (ArrayIndexOutOfBoundsException e) {
					System.err.println("m1() out of array");
					//System.exit(0);
					e.printStackTrace();
		 } catch (ArithmeticException e) {
				System.err.println("/0 non-valid operation");
				e.printStackTrace();
			} catch (Exception e) {
				System.err.println("main() go wrong");
				e.printStackTrace();
			}
	  finally {
				System.out.println("m1() finally done");
			}
		  return 5;
	  }

	public static void main(String[] args)  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input int k");
		Appl_train a= new Appl_train();	
		try {
			int k = Integer.parseInt(br.readLine());
			System.out.println("main() done. m1()= "+a.m1(k));
		} catch (NumberFormatException e) {
			System.err.println("main() non-format input");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("main() go wrong");
			e.printStackTrace();
		} finally {
		System.out.println("main() finally done");
	}
		System.out.println("main() done");
	//Appl_train a;
	//System.out.println("main() done. m1()= "+a.m1(2));
	//System.out.println("m2()= "+m2(1));
	//System.out.println("m3()= "+m3(1));
	
	/*
	public int m2(int n) {
		int[] arr2= {11,12};
		return arr2[n]/n;
	}
	- int m3(int n) {
		int k=4;
		return k/n;
	}
*/
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
}
	  
