package lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl291 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter integer a?");
		int a = Integer.parseInt(br.readLine());

		System.out.println("Enter integer b?");
		int b = Integer.parseInt(br.readLine());

		System.out.println("a + b = " + (a+b));
		System.out.println("a - b = " + (a-b));  
		System.out.println("a * b = " + (a*b));
		System.out.println("a / b = " + (a/b));  

		br.close();
	}

}
