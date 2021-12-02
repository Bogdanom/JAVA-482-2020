package lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("What is your name?");
	String name = br.readLine();
	System.out.println("Tel me, how old are you?");
	int age = Integer.parseInt(br.readLine());

	System.out.println("Hi, " + name);  
	System.out.println("Your age is " + age);
	  }

}
