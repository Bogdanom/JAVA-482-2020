package lesson9;

/* Write a method readNumber(int start, int end), that read from console integer number
 *  Return it, if it belongs to the range [start...end]. 
 *  If an invalid number or non-number text - method should throw an exception.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Range_Number {

	public static void main(String[] args)  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Enter start and end of the range, please");
			int start = Integer.parseInt(br.readLine());
			int end = Integer.parseInt(br.readLine());
			System.out.println("Enter integer k");
			int k = Integer.parseInt(br.readLine());
			div(start, end, k);
		} catch (NumberFormatException e) {
			System.err.println("non-format input");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.err.println("This number doesn't belong to the range");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("sth goes wrong");
			e.printStackTrace();
		} finally {
			System.out.println("main done");
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	static void div(int i, int j, int p) throws ArithmeticException {

		if (p < i | p > j)
			throw new ArithmeticException();
		System.out.println("Number " + p + " belongs to the range" + "[" + i + " : " + j + "]");
		
	}
}
