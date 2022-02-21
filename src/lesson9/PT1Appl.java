package lesson9;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidParameterException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public InvalidParameterException() {
		super();
	}
	public InvalidParameterException(String message) {
		super(message);
	}
    public InvalidParameterException(String message, Exception e) {
	    super(message, e);
}
}
public class PT1Appl {
	private final String EXCEPTION_MESSAGE="Invalid Parametr(s): a= %d, b = %d ";

	public static void main(String[] args) {
		PT1Appl p =new PT1Appl();
		int a=0;
		int b=0;
		int result=0;
		try (Scanner sc=new Scanner(System.in)) {
			System.out.print("a = ");
			a=sc.nextInt();
			System.out.print("b = ");
			b=sc.nextInt();
			result=p.squareRectangle(a,b);
		} catch (InputMismatchException e) {
			System.out.print("LOG: InputMismatchException found, e:\n"+e);
		} catch (InvalidParameterException e) {
			System.out.print("LOG: InvalidParameterException found, e:\n"+e);
		} catch (Exception e) {
			System.out.print("LOG: Exception found, e:\n"+e);
		}

	System.out.print("result = "+result);
	}
	public int squareRectangle(int a, int b) {
		int result = 0;
		if ((a < 0) | (b < 0))
			throw new InvalidParameterException(String.format(EXCEPTION_MESSAGE, a,b));
		result=a*b;
		return result;
	}
	
}
