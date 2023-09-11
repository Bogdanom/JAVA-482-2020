package lesson9;

/* Create method div(), which calculates the dividing of two double numbers. 
 * In main method input 2 double numbers and call this method. 
 * Catch all exceptions. 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;

public class Div_Two_Double {

	public static void main(String[] args) {

		System.out.println("Enter a and b, please");

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			double a = Double.parseDouble(br.readLine());
			double b = Double.parseDouble(br.readLine());
			div(a, b);
		} catch (NumberFormatException e) {
			System.err.println("non-format input");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.err.println("/0 non-valid operation");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("sth is wrong");
			e.printStackTrace();
		}
//		 finally {
//			System.out.println("try done");
//			try {
//				br.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		System.out.println("main done");
	}

	static void div(double n, double m) throws ArithmeticException {
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		if (m == 0) throw new ArithmeticException();
		System.out.println("Result of division = " + nf.format(n / m));
		System.out.println("div done");
	}
}